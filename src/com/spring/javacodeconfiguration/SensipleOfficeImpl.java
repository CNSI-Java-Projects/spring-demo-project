package com.spring.javacodeconfiguration;

import org.springframework.stereotype.Component;

@Component
public class SensipleOfficeImpl implements Office{

	@Override
	public String getOfficeName() {
		return "Sensiple";
	}

}
