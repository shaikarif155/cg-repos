package com.cg.deptemp.service;

import java.util.List;
import java.util.Optional;

import com.cg.deptemp.entities.Department;
import com.cg.deptemp.exceptions.DepartmentAlreadyExistException;
import com.cg.deptemp.exceptions.DepartmentNotFoundException;

public interface DepartmentService {
	void addDepartment(Department dept) throws DepartmentAlreadyExistException;
	List<Department> viewAllDepts();
	Optional<Department> getDeptById(int deptno) throws DepartmentNotFoundException;
	void updateDepartment(Department dept);
	void deleteDepartment(int deptno);
}
