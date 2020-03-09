package com.spring.xmlconfiguration;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkoutStatus() {
		return "Daily batting practice for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	
	
}
