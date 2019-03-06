package com.macs.teamtwo.brokerportalapplication.service;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macs.teamtwo.brokerportalapplication.domain.MortgageApplicant;
import com.macs.teamtwo.brokerportalapplication.repository.MortgageApplicantRepository;

// employee service class
@Service
public class MortgageApplicantService {
	
	MortgageApplicantService()
	{
		
	}
	
	@Autowired
	private MortgageApplicantRepository mortgageApplicantRepository;
	
	// inserting employee
	public MortgageApplicant addMortgageApplicant(MortgageApplicant applicant) {
		applicant.setApplicationStatus("Work In Progress");
	    String applicationNumberUnique="App-"+UUID.randomUUID().toString();
	    applicant.setApplicationNumber(applicationNumberUnique);
		MortgageApplicant mortgageApplicant=mortgageApplicantRepository.save(applicant);
		return mortgageApplicant;
	}

	public MortgageApplicant getApplicantByApplicationID(String ApplicationNumber) {
		// TODO Auto-generated method stub
		MortgageApplicant mortgageApplicant=mortgageApplicantRepository.getApplicantByApplicationNumber(ApplicationNumber);
		return mortgageApplicant;
	}
	
}
