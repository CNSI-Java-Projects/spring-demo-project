package com.spring.xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext path = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = path.getBean("myCricketCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkoutStatus());
		System.out.println(theCoach.getDailyFortune());
		path.close();
	}
}
