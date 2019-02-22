package com.iwonder.alice.third.schedual;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iwonder.alice.pro.entity.ProRepayMethod;
import com.iwonder.alice.pro.entity.ProRepayMethodExample;
import com.iwonder.alice.pro.entity.ProRepayPlan;
import com.iwonder.alice.pro.entity.ProRepayPlanExample;
import com.iwonder.alice.pro.entity.ProRepayPlanExample.Criteria;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;
import com.iwonder.alice.pro.service.IProRepayMethodService;
import com.iwonder.alice.pro.service.IProRepayPlanService;

@Component("AliceSchedual")
public class AliceSchedual {
	@Autowired
	IProRepayMethodService proRepayMethodService;
	@Autowired
	IProRepayPlanService proRepayPlanService;
	public AliceSchedual() {
		// TODO Auto-generated constructor stub
	}

	public void work() {

		System.out.println("job work.date:" + new Date().toString());
		
		
	}
	/*public void work() {

		
	
		HashMap ha = new HashMap();
		ha.put("payEachStatus", "no_pay_each");
		 List<ProRepayPlanView> proRepayPlans = proRepayPlanService.mySelectList(ha);//将未付款的 都给提取出来
		 System.out.println("proRepayPlans"+proRepayPlans);
		for(ProRepayPlanView proRepayPlan:proRepayPlans){
			
			Date nowDate2 = proRepayPlan.getNowDate();
		
			Calendar cal = Calendar.getInstance();
			cal.setTime(nowDate2);
			cal.add(Calendar.DATE, 10);
			Date nowDate = cal.getTime();
			
			long time = proRepayPlan.getNowDate().getTime();
			
			String repayId = proRepayPlan.getRepayId();
			ProRepayPlan record = new ProRepayPlan();
			record.setNowDate(nowDate);
			record.setRepayId(repayId);
			if(time>proRepayPlan.getTheoryRepayDate().getTime()){
				BigDecimal penaltyRate = proRepayPlan.getPenaltyRate();//罚息率
				BigDecimal loanAmount = proRepayPlan.getLoanAmount();//借款金额
				Integer overDays = proRepayPlan.getOverDays()+10;
				BigDecimal fine = loanAmount.multiply(penaltyRate).multiply(new BigDecimal(overDays));
				record.setFine(fine);
				record.setOverDays(overDays);
				record.setOverStatus("already_overdue");
			}
			proRepayPlanService.updateByPrimaryKeySelective(record );	
		}

		
	}*/
}
