package com.iwonder.alice.front.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iwonder.alice.framework.MD5.MD5Util;
import com.iwonder.alice.usr.entity.UsrInformation;
import com.iwonder.alice.usr.service.IUsrInformationService;

@Controller
@RequestMapping("/front/RegisterController/")
public class FrontRegisterController {
	@Autowired
	IUsrInformationService iUsrInformationService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {

		return "/front/register/register";
	}

	@RequestMapping("insertAj")
	@ResponseBody
	public String insertAj(UsrInformation record, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();

		String verification = (String) session.getAttribute("verification");

		String userTel = request.getParameter("userTel");
		String pwd = request.getParameter("pwd");
		String checkcode = request.getParameter("checkcode");

		String result = null;
		UsrInformation loadusr = null;
		try {
			if (userTel != null) {
				loadusr = iUsrInformationService.loadTel(userTel);

				if (loadusr == null) {
					boolean equals = verification.equalsIgnoreCase(checkcode);

					if (equals) {

						String salt = "salt";

						String encodeUserPwd = MD5Util.encode(pwd + salt);
						record.setUserPwd(encodeUserPwd);
						record.setUserTel(userTel);
						Date date = new Date();
						record.setUserCode(Long.toString(date.getTime()));
						record.setUserName(Long.toString(date.getTime()));
						// 增加
						iUsrInformationService.insert(record);
						return "1";
					}
				} else {
					if (pwd != null) {
						return "-1";
					}
				}

			}

		} catch (Exception ex) {
			ex.printStackTrace();
			result = "0";
		}
		return result;
	}

}
