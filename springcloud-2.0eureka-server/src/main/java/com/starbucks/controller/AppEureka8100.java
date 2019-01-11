package com.starbucks.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AppEureka8100 {

	public static void main(String[] args) {
		SpringApplication.run(AppEureka8100.class, args);
	}

}
