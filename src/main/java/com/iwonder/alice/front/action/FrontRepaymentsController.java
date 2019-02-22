package com.iwonder.alice.front.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.iwonder.alice.bas.service.BasDataDictionaryService;
import com.iwonder.alice.bas.view.YxysDataDictionaryView;
import com.iwonder.alice.framework.util.AliceUtils;
import com.iwonder.alice.framework.util.CalculationUtil;
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.front.service.IFrontApplicationService;
import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.ProRepayPlan;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayPlanService;

@Controller
@RequestMapping("/front/FrontRepaymentsController/")
public class FrontRepaymentsController {
	
	@Autowired
	IFrontApplicationService iFrontApplicationService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProLoanService proLoanService ;
	@Autowired
	IProRepayPlanService IProRepayPlanService;
	@RequestMapping("page")
	public String List(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("进入了FrontRepaymentsController 的 page方法");
		String loanId = request.getParameter("loanId");
		Date date = new Date();//当前时间
		if(!StringUtils.isEmpty(loanId)){//当点击确认借款按钮时候 进入这个方法 
			ProLoan befProLan = new ProLoan();
			befProLan.setLoanId(loanId);
			befProLan.setStartDate(date);
			proLoanService.updateByPrimaryKeySelective(befProLan);//点击还款按钮后 以 当时点击的时间开始进行计算
			ProLoan proLoan = new ProLoan();
			proLoan.setLoanId(loanId);
			proLoan.setReleaseStatus("yes_release");//设置 此记录为 已确认借款并且放款
			proLoan.setStartDate(new Date());//设置 从放款时候开始 计算利息
			proLoanService.updateByPrimaryKeySelective(proLoan);
			HashMap hCondition = new HashMap<>();
			hCondition.put("loanId", loanId);
			ProLoanView proLoan2 = proLoanService.mySelectOne(hCondition);
			Integer period = proLoan2.getPeriod();//总期数
			for(int i=0;i<period;i++){
				ProRepayPlan proRepayPlan = new ProRepayPlan();
				proRepayPlan.setLoanId(loanId);
				proRepayPlan.setRepayCode(new Date().getTime()+i+"");
				proRepayPlan.setTermNumber(i+1);
				String termLabel = proLoan2.getTermLabel();
				//这里是在计算理论还款时间====
				Calendar cal = Calendar.getInstance();
				if(termLabel.equals("一个月")){
					cal.add(Calendar.MONTH, 1);
				}else if(termLabel.equals("三个月")){
					cal.add(Calendar.MONTH, 3);
				}else if(termLabel.equals("六个月")){
					cal.add(Calendar.MONTH, 6);
				}
				Date theoryRepayDate  = cal.getTime();	//理论还款时间
				long nowDateMillisecond = date.getTime();
				long theoryRepayDateMillisecond = theoryRepayDate.getTime();
				long Between = theoryRepayDateMillisecond-nowDateMillisecond;//俩者时间差
				long oneTime = Between/period;//一份时间
				long aftEachRepaymentPeriodMillisecond=nowDateMillisecond+oneTime*(i+1);//当前期数理论还款时间毫秒值
				long befEachRepaymentPeriodMillisecond=nowDateMillisecond+oneTime*(i);//当前期数理论开始时间毫秒值
				Date befDate = new Date(befEachRepaymentPeriodMillisecond) ;//当前期数理论开始时间
				Date aftDate = new Date(aftEachRepaymentPeriodMillisecond) ;//当前期数理论还款时间
				String dateFormat = AliceUtils.dateFormat(theoryRepayDate);
				proRepayPlan.setEachStartDate(befDate);
				proRepayPlan.setTheoryRepayDate(aftDate);
				proRepayPlan.setActualRepayDate(null);//实际还款时间 后面还款插入	
				//本处开始计算等额本息
				//等额本息计算法
						/*本息= 贷款总金额*月利率*（1+月利率）^总期数/（（1+月利率）^总期数-1） 平方计算法  Math.pow(b,2);
						第n个月还贷本金为=贷款总金额*贷款月利率（1+贷款月利率）^(第N期还贷数-1)/（（1+月利率）^总期数-1）
						第n个月还贷利息为 本息-第n个月还贷本金*/	
				
				BigDecimal loanAmount = proLoan2.getLoanAmount();//借款总金额
				BigDecimal monthRate = proLoan2.getMonthRate();//月利率
				BigDecimal needPrincipal = null;
				BigDecimal interest = null;
				 String repayMethod = proLoan2.getRepayMethod();
				if(repayMethod.equals("EAOI")){
				/*BigDecimal x = monthRate.add(new BigDecimal("1"));//（1+月利率）
				BigDecimal t=x;
				for(int j=0;j<period-1;j++){
					t=t.multiply(x);	//（1+月利率）^总期数
				}
				BigDecimal y=t;//（（1+月利率）^总期数-1）
				BigDecimal PI=loanAmount.multiply(monthRate).multiply(x).divide(y ,2 , BigDecimal.ROUND_UP );//本息
				BigDecimal o = x;
				for(int p=0;p<i;p++){
					o=o.multiply(x);
				}
				 needPrincipal =	loanAmount.multiply(monthRate).multiply(o).divide(y ,2 , BigDecimal.ROUND_UP);	//第n个月还贷本金
				 interest= PI.subtract(needPrincipal);*/
					
					CalculationUtil CalculationUtil = new CalculationUtil();
					CalculationUtil.setMonthlyInterestRate(monthRate);
					CalculationUtil.setMonthlyNumber(period);
					CalculationUtil.setPrincipal(loanAmount);
					CalculationUtil.setRepaymentMonths(i);
					needPrincipal=CalculationUtil.getMonthlyPrincipal();
					interest=CalculationUtil.getInterest()	;
				}else if(repayMethod.equals("EAOP")){
					//等额本金还款法
					//每月应还本金=贷款本金÷还款期数
					//每月应还利息=剩余本金×月利率=(贷款本金-已归还本金累计额)×月利率
					needPrincipal=loanAmount.divide(new BigDecimal(period),2 , BigDecimal.ROUND_HALF_UP);
					BigDecimal surplusPrincipal=loanAmount;
					for(int l=0;l<i;l++){
						surplusPrincipal=surplusPrincipal.subtract(needPrincipal);//计算剩余本金
					}
					interest=surplusPrincipal.multiply(monthRate);	
				} 
				proRepayPlan.setNeedPrincipal(needPrincipal);//每期需要还款的本金	
				proRepayPlan.setInterest(interest);//每期需要还款的利息
				proRepayPlan.setOverDays(new Integer(0));
				proRepayPlan.setFine(new BigDecimal("0"));//罚息 后面还款插入
				proRepayPlan.setOverStatus("no_overdue");//设置逾期状态
				proRepayPlan.setPaidPrincipal(new BigDecimal("0"));//设置已付本金
				proRepayPlan.setPaidInterest(new BigDecimal("0"));//设置已付利息
				proRepayPlan.setPaidFine(new BigDecimal("0"));//设置已付罚息
				proRepayPlan.setPayEachStatus("no_pay_each");
				proRepayPlan.setNowDate(date);
				IProRepayPlanService.insert(proRepayPlan);	
				System.out.println("dateFormat");
			}
		}
		return "/front/yxy/Repayments";
	}
	@RequestMapping("pageAjax")
	@ResponseBody
	public PageView pageAjax(HttpServletRequest request,HttpServletResponse response){
		System.out.println("===========");
	
		
		PageView pageView = new PageView();
		String strPageIndex = request.getParameter("pageIndex");
		String strPageSize = request.getParameter("pageSize");

		
		int pageIndex = 0;
		int pageSize = 5;
		
		if(!StringUtils.isEmpty(strPageSize)){
			pageIndex = Integer.parseInt(strPageIndex);
		}
		
		if(!StringUtils.isEmpty(strPageSize)){
			pageSize = Integer.parseInt(strPageSize);
		}
		

		HttpSession session= request.getSession();
		String loginUserId = (String) session.getAttribute("loginUserId");
		Page<Object> page = PageHelper.startPage(pageIndex, pageSize);

			HashMap hCondition = new HashMap();		
			hCondition.put("dictionaryDetailCodeAuditStatus", "already_audit");	
			hCondition.put("dictionaryDetailCodePayStatus", "no_pay");
			hCondition.put("dictionaryDetailCodeReleaseStatus", "yes_release");
		 
		List<ProLoanView> listProLoanApplication1 = proLoanService.mySelectList(hCondition);
		List<ProLoanView> listProLoanApplication = new ArrayList();
		for(ProLoanView ProLoanApplication:listProLoanApplication1){
			HashMap ha = new HashMap<>();
			ha.put("repayMethodId", ProLoanApplication.getRepayMethodId());
			List<YxysDataDictionaryView> listRepayMethod = basDataDictionaryService.mySelectList(ha);
			for(YxysDataDictionaryView repayMethod:listRepayMethod){
				if(repayMethod.getDictionaryDetailCode().equals(ProLoanApplication.getRepayMethod())){
					ProLoanApplication.setRepayMethod(repayMethod.getDictionaryDetailLabel());
					listProLoanApplication.add(ProLoanApplication);
				}
			}
		}
		System.out.println("listProLoanApplication"+listProLoanApplication+"==========");
		System.out.println(listProLoanApplication.toString());
		pageView.setList(listProLoanApplication);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
		pageView.setRecordCount((int)page.getTotal());
		System.out.println("recordCount:"+pageView.getRecordCount());
		return pageView;
	}
}
