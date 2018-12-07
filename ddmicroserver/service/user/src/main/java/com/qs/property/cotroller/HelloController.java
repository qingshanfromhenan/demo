package com.qs.property.cotroller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qs.property.entity.QxUserEntity;
import com.qs.property.service.IQxUserService;


@RestController
public class HelloController {

	@Value("${server.port}")
	String port;

	@RequestMapping("/hello")
	public String hello(HttpServletRequest req) {
		String name=req.getParameter("name");
		return "hello " + name + " ,i am from port:" + port;
	}

	@Resource
	private IQxUserService iwaps;

	@ResponseBody
	@RequestMapping({"/demo"})
	public String demo() {
		return "Hello world!!!";
	}

	@ResponseBody
	@RequestMapping({"/findall"})
	public String findall() {
		List<QxUserEntity> find = iwaps.findPerson("dianduzongbu001");
		return find.toString();
	}
}
