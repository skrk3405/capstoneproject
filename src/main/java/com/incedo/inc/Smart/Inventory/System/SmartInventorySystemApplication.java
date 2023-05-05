package com.incedo.inc.Smart.Inventory.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SmartInventorySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartInventorySystemApplication.class, args);
	}

//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}

}
