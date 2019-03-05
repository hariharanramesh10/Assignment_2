package com.macs.groupone.brokerportalapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages={"com.macs.groupone.brokerportalapplication", "com.macs.groupone.brokerportalapplication.controller","com.macs.groupone.brokerportalapplication.repository","com.macs.groupone.brokerportalapplication.service","com.macs.groupone.brokerportalapplication.domain"})
public class BrokerportalApplication extends SpringBootServletInitializer {
	
	static Logger logger = LoggerFactory.getLogger(BrokerportalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BrokerportalApplication.class, args);
		logger.trace("Frindbook Application has been started..");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BrokerportalApplication.class);
	}

	

}

