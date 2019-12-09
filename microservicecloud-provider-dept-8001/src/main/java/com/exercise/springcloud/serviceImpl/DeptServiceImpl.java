package com.exercise.springcloud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.springcloud.dao.DeptDao;
import com.exercise.springcloud.entites.Dept;
import com.exercise.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean addDept(Dept dept) {
		boolean addDept = deptDao.addDept(dept);
		return addDept;
	}

	@Override
	public Dept findById(Long id) {
		Dept dept = deptDao.findById(id);
		return dept;
	}

	@Override
	public List<Dept> findAll() {
		List<Dept> deptList = deptDao.findAll();
		return deptList;
	}

}
