package com.exercise.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.exercise.springcloud.entites.Dept;

@RestController
public class DeptController_Consumer {

	@Autowired
	private RestTemplate restTemplate;

	// private static final String url = "http://localhost:8001/";
	private static final String url = "http://MICROSERVICECLOUD-DEPT";

	@GetMapping("/consumer/dept/add")
	public boolean addDept(Dept dept) {

		return restTemplate.postForObject(url + "/dept/addDept", dept, Boolean.class);

	}

	@GetMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {

		return restTemplate.getForObject(url + "/dept/get/" + id, Dept.class);

	}

	@GetMapping("/consumer/dept/list")
	public List<Dept> get() {

		return restTemplate.getForObject(url + "/dept/list", List.class);

	}
}
