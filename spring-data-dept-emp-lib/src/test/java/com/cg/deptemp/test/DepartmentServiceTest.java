package com.cg.deptemp.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.deptemp.repository.DepartmentRepository;
import com.cg.deptemp.service.DepartmentService;
import com.cg.deptemp.service.DepartmentServiceImpl;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {
	@Mock
	DepartmentRepository deptrepo;
	
	@InjectMocks
	DepartmentService deptser = new DepartmentServiceImpl();
	
	@Test
	public void testGetAllDepts() {
		deptser.viewAllDepts();
		//Mockito.verify(deptrepo).findAll();
		
	}
}
