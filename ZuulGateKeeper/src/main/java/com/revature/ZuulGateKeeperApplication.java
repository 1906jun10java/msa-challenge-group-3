package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulGateKeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateKeeperApplication.class, args);
	}
	
	@RequestMapping
	public String callBusiness() {
		return "BUSINESS";
	}

}
