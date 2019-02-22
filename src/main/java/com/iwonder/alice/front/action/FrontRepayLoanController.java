package com.iwonder.alice.front.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front/RepayLoanController/")
public class FrontRepayLoanController {

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		
		
		
		
		
		return "/front/index/repayLoan";
	}

}
