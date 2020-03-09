package com.spring.javacodeconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("devEmployee")
public class DevEmployee implements Employee{

	@Autowired
	@Qualifier("officeImpl") 
	private Office office;
	
	@Override
	public String getName() {
		return "Vishnu";
	}

	@Override
	public String getAddress() {
		return "Bentonville";
	}
	
	public void getOfficeName() {
		System.out.println(office.getOfficeName());
	}

}
