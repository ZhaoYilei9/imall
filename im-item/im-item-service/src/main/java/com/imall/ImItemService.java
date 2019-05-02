package com.imall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.imall.mapper"})
public class ImItemService {
	public static void main(String[] args) {
		SpringApplication.run(ImItemService.class, args);
	}
}
