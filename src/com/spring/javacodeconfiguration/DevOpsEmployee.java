package com.spring.javacodeconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class DevOpsEmployee implements Employee {

	private Office office;
	
	public DevOpsEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Office getOffice() {
		return office;
	}

	@Autowired
	public void setOffice(Office office) {
		this.office = office;
	}


	@Override
	public String getName() {
		
		return "Tamil";
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return "Erode";
	}

	@Override
	public void getOfficeName() {
		System.out.println(office.getOfficeName());
		
	}

}
