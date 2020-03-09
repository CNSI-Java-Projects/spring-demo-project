package com.spring.xmlconfiguration;

public class MyApp {

	public static void main(String[] args) {
		//BaseBallCoach coach = new BaseBallCoach();
		
		Coach theCoach = new CricketCoach();
		System.out.println(theCoach.getDailyWorkoutStatus());
	}

}
