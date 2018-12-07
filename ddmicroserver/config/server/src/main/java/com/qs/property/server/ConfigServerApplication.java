package com.qs.property.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer//开启配置服务中心
public class ConfigServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
