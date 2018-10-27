package com.anshul.springdemo;

public class GolfCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public GolfCoach() {
		System.out.println("GolfCoach: inside no-arg constructor");
	}
	
	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice grip, alignment and posture for 1 hour!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
