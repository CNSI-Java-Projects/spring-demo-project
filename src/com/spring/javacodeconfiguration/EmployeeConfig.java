package com.spring.javacodeconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.javacodeconfiguration")
public class EmployeeConfig {
//	@Bean
//	public Office getOfficeDetails() {
//		return new SensipleOfficeImpl();
//	}
//	
//	@Bean
//	public Employee getEmployee() {
//		return new QAEmployee(getOfficeDetails());
//	}
}
