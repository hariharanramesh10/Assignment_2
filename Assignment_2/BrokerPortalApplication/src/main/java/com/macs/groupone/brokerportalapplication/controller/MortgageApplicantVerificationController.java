package com.macs.groupone.brokerportalapplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.macs.groupone.brokerportalapplication.domain.MortgageApplicant;
import com.macs.groupone.brokerportalapplication.service.MortgageApplicantService;



@RestController
public class MortgageApplicantVerificationController {

	@Autowired
	MortgageApplicantService mortgageApplicantService;

	// Verify the Applicant application Number
	@GetMapping(value = "/morgageaaplicant/{applicationNumber}")
	public MortgageApplicant showLoginPage(@PathVariable String applicationNumber) {
		return mortgageApplicantService.getApplicantByApplicationID(applicationNumber);
		
	}

}
