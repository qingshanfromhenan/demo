package com.qs.property.cotroller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qs.property.service.IWyAllPropertyService;

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
	private IWyAllPropertyService iwaps;

	@ResponseBody
	@RequestMapping({"/demo"})
	public String demo() {
		return "Hello world!!!";
	}

	@ResponseBody
	@RequestMapping({"/findall"})
	public String findall() {
		Map<String, Object> find = iwaps.findall();
		return find.toString();
	}
}
