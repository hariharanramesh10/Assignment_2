package com.macs.groupone.employerportalapplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.macs.groupone.employerportalapplication.service.EmployeeService;



@Controller
public class ApplicationStatusController {

	@Autowired
	EmployeeService employeeService;

	
	// show application status page
	@RequestMapping(value = "/applicationstatus", method = RequestMethod.GET)
	public String showApplicationStatusPage(ModelMap model) {
		return "applicationstatus";
	}

	// Process application status
	@RequestMapping(value = "/applicationstatus", method = RequestMethod.POST)
	public ModelAndView processApplicantValidityWithBroker(ModelAndView modelAndView) {
		//invoke web service of broker provided link
		//get link and get ApplicationNumbe from user and then invoke web service
		 if(null==null)
		    {
		    	modelAndView.addObject("successMessage", "Employee Authenticated Sucessfully from Broker");
		    }else
		    {
		    	modelAndView.addObject("errorMessage", "Something went Wrong...");
		    }
			modelAndView.setViewName("applicationstatus");
		return modelAndView;
		
	}

}
