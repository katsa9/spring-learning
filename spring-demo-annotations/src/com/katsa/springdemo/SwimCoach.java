package com.katsa.springdemo;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "do some lengths";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
