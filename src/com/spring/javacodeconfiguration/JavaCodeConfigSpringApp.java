package com.spring.javacodeconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.javacodeconfiguration.Employee;

public class JavaCodeConfigSpringApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext path = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp = path.getBean("devEmployee",Employee.class);
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		emp.getOfficeName();
		path.close();
	}

}
