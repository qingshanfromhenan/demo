package com.qs.property.clients.impl;

import org.springframework.stereotype.Component;

import com.qs.property.clients.SchedualServiceHello;

@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello{

	@Override
	public String sayHelloFromClientOne(String name) {
		
		return "sorry "+name;
	}

	@Override
	public String findall() {
		return "no select";
	}

	@Override
	public String demo() {
		
		return "no demo";
	}

}
