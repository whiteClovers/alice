package com.iwonder.alice.front.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/front/FrontPersonalController/")
public class FrontPersonalController {
	@RequestMapping("page")
	public String List(HttpServletRequest request) {
		
		return "/front/yxy/personal";
	}
}
