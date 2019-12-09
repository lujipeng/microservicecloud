package com.exercise.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MyConfigBean {
	@Bean
	public IRule myRule() {
		return new MySelfRule();

	}

}
