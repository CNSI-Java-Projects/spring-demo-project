package com.spring.javacodeconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class QAEmployee implements Employee {

	
	private Office office;
	
	@Autowired	
	public QAEmployee(Office office) {
		this.office = office;
	}
	
	@Override
	public String getName() {
		return "parkavi";
	}

	@Override
	public String getAddress() {
		return "Chennai";
	}

	@Override
	public void getOfficeName() {
		System.out.println(office.getOfficeName());
		
	}

}
