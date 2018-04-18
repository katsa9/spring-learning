package com.katsa.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	//add destroy method
	public void doDestroytuff() {
		System.out.println("TrackCoach: inside method doDestroytuff");
	}

}
