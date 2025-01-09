package com.pavan.companymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CompanymicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanymicroserviceApplication.class, args);
	}

}
