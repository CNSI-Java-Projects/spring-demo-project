package com.spring.annotationconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext path = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		Employee emp = path.getBean("devOpsEmployee",Employee.class);
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		emp.getOfficeName();
		path.close();
	}

}
