package com.macs.teamtwo.employerportalapplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.macs.teamtwo.employerportalapplication.domain.Employee;
import com.macs.teamtwo.employerportalapplication.domain.MortgageApplicant;
import com.macs.teamtwo.employerportalapplication.repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {
	
	//static final String URL_EMPLOYEE = "http://localhost:8086/morgageaaplicant/";
	
	@Autowired
	private Environment env;
	
	String BrokerPort = env.getRequiredProperty("BrokerPort");
	String BrokerIp = env.getRequiredProperty("BrokerIp");
	
	String URL_EMPLOYEE ="http://"+BrokerIp+":"+BrokerPort+"/morgageaaplicant/";	
	
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
	
	// get employee by email id and password
		public Boolean getEmployeeByApplicationNumber(String applicationNumber,String link) {
			RestTemplate restTemplate = new RestTemplate();
	        // Send request with GET method and default Headers.
	        MortgageApplicant applicant = restTemplate.getForObject(URL_EMPLOYEE+applicationNumber, MortgageApplicant.class);
	        if (applicant != null) {
	                System.out.println("Employee: " + applicant.getFirstName() + " - " + applicant.getLastName()); 
	                return true;
	        }
			return false;
		}

	
}
