package com.iwonder.alice.front.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iwonder.alice.front.Verify.SCaptcha;

@Controller
@RequestMapping("/front/IndexController/")
public class FrontIndexController {

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		
		return "/front/index/index";
	}
	
	@RequestMapping("getVerify")
	@ResponseBody
	public void verification(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		// 设置响应的类型格式为图片格式
		response.setContentType("image/jpeg");
		// 禁止图像缓存。
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		// 实例生成验证码对象
		SCaptcha instance = new SCaptcha();
		// 将验证码存入session
		session.setAttribute("verification", instance.getCode());
		// 向页面输出验证码图片
		instance.write(response.getOutputStream());
	}

}
