package com.exercise.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.springcloud.entites.Dept;
import com.exercise.springcloud.entites.service.DeptClientService;

@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService service;

	// private static final String url = "http://localhost:8001/";
	private static final String url = "http://MICROSERVICECLOUD-DEPT";

	@GetMapping("/consumer/dept/add")
	public boolean addDept(Dept dept) {

		return service.addDept(dept);

	}

	@GetMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {

		return service.findById(id);

	}

	@GetMapping("/consumer/dept/list")
	public List<Dept> get() {

		return service.list();

	}
}
