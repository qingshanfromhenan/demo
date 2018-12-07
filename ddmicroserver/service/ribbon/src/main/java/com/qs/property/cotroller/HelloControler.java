package com.qs.property.cotroller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qs.property.service.IHelloService;

@RestController
public class HelloControler {
	
	@Resource
	IHelloService ihs;
	
	@RequestMapping(value="/hello")
	public String hello(HttpServletRequest req) {
		String name=req.getParameter("name");
		return ihs.helloService( name );
	}
	
	@RequestMapping(value="/findall")
	public String findall(HttpServletRequest req) {
		return ihs.findall();
	}
	
	@RequestMapping(value="/demo")
	public String demo(HttpServletRequest req) {
		return ihs.demo();
	}
}
