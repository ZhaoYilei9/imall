package com.imall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ImRegistry {
	public static void main(String[] args) {
		SpringApplication.run(ImRegistry.class, args);
	}

}
