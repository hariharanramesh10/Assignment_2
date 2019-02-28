package com.macs.groupone.employerportalapplication.controller;



import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.macs.groupone.employerportalapplication.domain.Employee;
import com.macs.groupone.employerportalapplication.service.EmployeeService;

@Controller
public class LoginController {

	@Autowired
	EmployeeService employeeService;


	// show registration
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginPage(ModelAndView modelAndView) {
		modelAndView.setViewName("login");
		return modelAndView;
	}

	// Process form input data
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView processLoginForm(ModelAndView modelAndView, @Valid Employee employee) {
		    
		    Employee emp=employeeService.getEmployeeByEmailAndPassword(employee.getEmail(), employee.getPassword());
		    if(emp!=null)
		    {
		    	modelAndView.addObject("successMessage", "Employee Authenticated Sucessfully");
		    }else
		    {
		    	modelAndView.addObject("errorMessage", "Something went Wrong...");
		    }
			modelAndView.setViewName("applicationstatus");
		return modelAndView;
	}

}