package com.macs.groupone.employerportalapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages={"com.macs.groupone.employerportalapplication", "com.macs.groupone.employerportalapplication.controller","com.macs.groupone.employerportalapplication.repository","com.macs.groupone.employerportalapplication.service","com.macs.groupone.employerportalapplication.domain"})
public class EmployerportalApplication extends SpringBootServletInitializer {
	
	static Logger logger = LoggerFactory.getLogger(EmployerportalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmployerportalApplication.class, args);
		logger.trace("Frindbook Application has been started..");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EmployerportalApplication.class);
	}

	

}

