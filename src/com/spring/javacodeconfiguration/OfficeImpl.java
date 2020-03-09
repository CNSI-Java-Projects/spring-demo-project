package com.spring.javacodeconfiguration;

import org.springframework.stereotype.Component;

@Component
public class OfficeImpl implements Office {

	@Override
	public String getOfficeName() {
		return "Walmart";
	}

}
