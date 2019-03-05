package com.macs.groupone.brokerportalapplication.controller;

import java.util.UUID;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.macs.groupone.brokerportalapplication.domain.MortgageApplicant;
import com.macs.groupone.brokerportalapplication.service.MortgageApplicantService;

@Controller
public class RegistrationController {

	@Autowired
	MortgageApplicantService mortgageApplicantService;


	// show registration
	@RequestMapping(value = "/mortgageapplicationform", method = RequestMethod.GET)
	public ModelAndView showSignUpPage(ModelAndView modelAndView) {
		modelAndView.setViewName("mortgageapplicationform");
		return modelAndView;
	}

	// Process form input data
	@RequestMapping(value = "/mortgageapplicationform", method = RequestMethod.POST)
	public ModelAndView processRegistrationForm(ModelAndView modelAndView, @Valid MortgageApplicant mortgageApplicant) {
		    
		    MortgageApplicant addedMortgageApplicant=mortgageApplicantService.addMortgageApplicant(mortgageApplicant);
		    if(addedMortgageApplicant!=null)
		    {
		    	modelAndView.addObject("successMessage", "Application submitted Sucessfully");
		    	modelAndView.addObject("applicationNumber"+addedMortgageApplicant.getApplicationNumber());
		    	modelAndView.addObject("link"+"http://localhost:8080/applicantdetails");
		    }else
		    {
		    	modelAndView.addObject("errorMessage", "Something went Wrong...");
		    }
			modelAndView.setViewName("mortgageapplicationform");
		return modelAndView;
	}

}
