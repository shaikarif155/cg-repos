package com.cg.deptemp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.deptemp.entities.Department;
import com.cg.deptemp.service.DepartmentServiceImpl;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	DepartmentServiceImpl service;
	
	@PostMapping
	public ResponseEntity<String> addDepartment(@RequestBody Department dept){
		service.addDepartment(dept);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}
}
