package com.macs.groupone.employerportalapplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macs.groupone.employerportalapplication.domain.Employee;
import com.macs.groupone.employerportalapplication.repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {
	
	EmployeeService()
	{
		
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// get employee by email id and password
	public Employee getEmployeeByEmailAndPassword(String email,String password) {
		Employee employee=employeeRepository.getEmployeeByEmailAndPassword(email, password);
		return employee;
	}

	
}
