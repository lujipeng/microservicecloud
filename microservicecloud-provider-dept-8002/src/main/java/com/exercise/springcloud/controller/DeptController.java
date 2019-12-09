package com.exercise.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.springcloud.entites.Dept;
import com.exercise.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;

	@PostMapping("/dept/addDept")
	public boolean addDept(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.findById(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.findAll();
	}

}
