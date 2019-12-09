package com.exercise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EurekaConsumer9527_ZUUL {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer9527_ZUUL.class, args);
	}

}
