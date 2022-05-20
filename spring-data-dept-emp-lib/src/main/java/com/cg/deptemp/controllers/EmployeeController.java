package com.cg.deptemp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.deptemp.dto.EmployeeDto;
import com.cg.deptemp.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl empservice;
	
	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDto empdto){
		int empno = empservice.addEmployee(empdto);
		return new ResponseEntity<String>("inserted empcode = "+empno,HttpStatus.OK);
	}
}
