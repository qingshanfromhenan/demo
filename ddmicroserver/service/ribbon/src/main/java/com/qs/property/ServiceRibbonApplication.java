package com.qs.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient//作为服务中心的一个客户端
@EnableDiscoveryClient//向服务中心注册
@EnableHystrix//开启Hystrix断路器功能,当访问的服务请求失败会快速返回熔断方法,不会等待响应超时
public class ServiceRibbonApplication {
	
	public static void main(String[] args) {
        SpringApplication.run( ServiceRibbonApplication.class, args );
    }
	
		
	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
