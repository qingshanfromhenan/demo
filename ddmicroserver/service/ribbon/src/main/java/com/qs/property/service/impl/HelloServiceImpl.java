package com.qs.property.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qs.property.service.IHelloService;

@Service
public class HelloServiceImpl implements IHelloService{

	@Autowired
	RestTemplate restTemplate;


	//对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
	@HystrixCommand(fallbackMethod = "helloError")
	public String helloService(String name) {
		return restTemplate.getForObject("http://SERVICE-USER/hello?name="+name,String.class);
	}


	public String helloError(String name) {
		return "hello,"+name+",sorry,error!";
	}


	@HystrixCommand(fallbackMethod = "findError")
	public String findall() {
		return restTemplate.getForObject("http://SERVICE-USER/findall",String.class);
	}
	
	public String findError() {
		return "hello,sorry,find error!";
	}


	@HystrixCommand(fallbackMethod = "demoError")
	public String demo() {
		return restTemplate.getForObject("http://SERVICE-USER/demo",String.class);
	}
	
	public String demoError() {
		return "hello,sorry,demo error!";
	}
}
