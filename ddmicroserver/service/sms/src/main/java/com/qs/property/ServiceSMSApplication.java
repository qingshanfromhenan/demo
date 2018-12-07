package com.qs.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 
 * @author qingshan
 *
 */
@SpringBootApplication
@EnableEurekaClient//作为服务中心的一个客户端
@EnableDiscoveryClient//向服务中心注册
public class ServiceSMSApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceSMSApplication.class, args );
    }
    
}



