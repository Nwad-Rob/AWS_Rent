package com.rent.renters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RentersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentersApplication.class, args);
	}

}
