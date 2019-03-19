package com.portal.employeeportalms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.portal.employeeportalms")
public class EmployeePortalMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePortalMsApplication.class, args);
	}

}
