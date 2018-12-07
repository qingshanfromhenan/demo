package com.qs.property.cotroller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qs.property.clients.SchedualServiceHello;

@RestController
public class HelloController {

	@Resource
	SchedualServiceHello ssh;
	
	
	@RequestMapping(value="/hello")
	public String sayHello(HttpServletRequest req) {
		String name=req.getParameter("name");
		return ssh.sayHelloFromClientOne(name);
	}
	@RequestMapping(value="/findall")
	public String findall(HttpServletRequest req) {
		return ssh.findall();
	}
	@RequestMapping(value="/demo")
	public String demo(HttpServletRequest req) {
		return ssh.demo();
	}
}
