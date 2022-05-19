package com.cg.deptemp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.deptemp.entities.Department;
import com.cg.deptemp.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository deptrepo;
	@Override
	public void addDepartment(Department dept) {
		deptrepo.save(dept);		
	}

}
