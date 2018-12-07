package com.qs.property.client.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	
	@RequestMapping(value = "/hello")
	public String hello(HttpServletRequest req){
		String name=req.getParameter("name");
		return name;
	}
}
