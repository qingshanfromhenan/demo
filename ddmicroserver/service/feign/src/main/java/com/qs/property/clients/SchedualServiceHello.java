package com.qs.property.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.qs.property.clients.impl.SchedualServiceHelloHystric;

/**
 * 
 * @author qingshan
 *
 */
//value=负载均衡的服务名;fallback=服务断路后返回内容,实现当前类
@FeignClient(value = "service-sms",fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	String sayHelloFromClientOne(@RequestParam(value = "name") String name);
	
	@RequestMapping(value = "/findall",method = RequestMethod.GET)
	String findall();
	
	@RequestMapping(value = "/demo",method = RequestMethod.GET)
	String demo();
}
