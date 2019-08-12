package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusinessServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessServiceAApplication.class, args);
	}

}
