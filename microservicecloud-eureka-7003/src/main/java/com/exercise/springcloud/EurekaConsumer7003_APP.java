package com.exercise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaConsumer7003_APP {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer7003_APP.class, args);
	}
}
