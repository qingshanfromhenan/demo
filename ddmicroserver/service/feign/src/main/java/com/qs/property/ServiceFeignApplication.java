package com.qs.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//作为服务中心的客户端
@EnableDiscoveryClient//向服务中心注册
@EnableFeignClients//开启Feign
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run( ServiceFeignApplication.class, args );
	}

}
