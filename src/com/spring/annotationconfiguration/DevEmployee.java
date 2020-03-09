package com.spring.annotationconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("devEmployee")
public class DevEmployee implements Employee{

	@Autowired
	private OfficeImpl officeImpl;
	
	@Override
	public String getName() {
		return "Vishnu";
	}

	@Override
	public String getAddress() {
		return "Bentonville";
	}
	
	public void getOfficeName() {
		System.out.println(officeImpl.getOfficeName());
	}

}
