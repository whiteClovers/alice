package com.iwonder.alice.front.action;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iwonder.alice.framework.MD5.MD5Util;
import com.iwonder.alice.framework.util.AliceUtils;
import com.iwonder.alice.pro.service.IProRepayMethodService;
import com.iwonder.alice.usr.entity.UsrInformation;
import com.iwonder.alice.usr.entity.UsrInformationExample;
import com.iwonder.alice.usr.entity.UsrInformationExample.Criteria;
import com.iwonder.alice.usr.service.IUsrInformationService;
import com.mysql.fabric.xmlrpc.base.Data;



@Controller
@RequestMapping("/front/LoginController/")
public class FrontLoginController {
	@Autowired
	IUsrInformationService iUsrInformationService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request,HttpServletResponse responst) {
		
		return "/front/login/login";
	}
	@ResponseBody
	@RequestMapping("login")
	public String toLogin(HttpServletRequest request,HttpServletResponse responst) {
		String userTel = request.getParameter("userTel");
		String pwd = request.getParameter("pwd");
		String checkcode = request.getParameter("checkcode");
		
		Date date = new Date();//获取当前时间
		HttpSession session = request.getSession();//得到session
		//获取图片验证码
		String verification = (String) session.getAttribute("verification");
		boolean check=true;
		String result  =null;
		Enumeration attributeNames = session.getAttributeNames();
		while(attributeNames.hasMoreElements()){//遍历 session集合  如果有存在user  则不创建
			String user2=(String) attributeNames.nextElement();	
			if(user2.equals(userTel)&&pwd!=null){		
				check=false;
			}
		}	
		
		if(check){
			if(!StringUtils.isEmpty(userTel)&&!StringUtils.isEmpty(pwd)){//如果不存在 则 进行第一次登录
				try {
					String salt = "salt";
					String Ppwd = MD5Util.encode(pwd + salt) ;//加密 查询
					
					UsrInformation loadUsrInfor = iUsrInformationService.loadTel(userTel);
					System.out.println("loadUsrInfor"+loadUsrInfor);
					if(!StringUtils.isEmpty(loadUsrInfor)){
						System.out.println("loadUsrInfor.getUserPwd()  "+loadUsrInfor.getUserPwd());
						System.out.println("Ppwd  "+Ppwd);
						//图片验证、、
						if(loadUsrInfor.getUserPwd().equals(Ppwd)&&verification.equalsIgnoreCase(checkcode)){		
							result="1";//登录成功
						session.setAttribute("loginUserId", loadUsrInfor.getUserId());
						
						}else{
							result="0";//登录失败
							
						}
					}	
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
			session.setAttribute(userTel, date);//并存入时间 当前用户访问的时间
		}
		if(session.getAttribute(userTel)!=null){
		Date date2 = (Date) session.getAttribute(userTel);//得到时间
		long differSecond = AliceUtils.differSecond(date, date2);//计算出 相差的毫秒数
		if(differSecond<=7){
			if(result==null){
			result="2";//账号多次登录 已被锁定  请等待7秒后在继续
			}
		}else{
			session.removeAttribute(userTel);
			result="3";//已解除锁定 输入账号密码进行登录
		}
		}
		return result;
	}

}
