package com.exercise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_API {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_API.class, args);
	}
}
