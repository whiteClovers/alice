package com.iwonder.alice.front.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front/updatePersonInfo/")
public class FrontQuotaApplyController {

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		return "/front/update_person_info";
	}
}
