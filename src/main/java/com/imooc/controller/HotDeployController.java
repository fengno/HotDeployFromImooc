package com.imooc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HotDeployController {

	@RequestMapping(value="/say", method=RequestMethod.GET)
	public String say(HttpServletRequest request) {
		request.setAttribute("say", "Hello Imooc");
		//要与templates目录下的文件名同名
		return "imooc";
	}
}
