package com.cg.deptemp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.deptemp.dto.EmployeeDto;
import com.cg.deptemp.entities.Department;
import com.cg.deptemp.entities.Employee;
import com.cg.deptemp.exceptions.DepartmentNotFoundException;
import com.cg.deptemp.repository.DepartmentRepository;
import com.cg.deptemp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository emprepo;
	@Autowired
	DepartmentRepository deptrepo;
	
	@Override
	public int addEmployee(EmployeeDto empdto) {
		// Get Department object by passing deptno from empdto
		  Department dept = deptrepo.getDeptById(empdto.getDeptno());
		  if(dept==null)
			  throw new DepartmentNotFoundException();
		  
		  Employee emp = new Employee();
		  emp.setEmpname(empdto.getEmpname());
		  emp.setJob(empdto.getJob());
		  emp.setDoj(empdto.getDoj());
		  emp.setSalary(empdto.getSalary());
		  emp.setDept(dept);
		  //emprepo.save(emp);
		  System.out.println(empdto); 
		 return emp.getEmpno();
	}

}
