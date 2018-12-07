package com.qs.property.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author qingshan
 *
 */
@SpringBootApplication//SpringBoot核心注解,main方法类用
@EnableEurekaServer//开启服务发现
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication.class, args );
    }
}
