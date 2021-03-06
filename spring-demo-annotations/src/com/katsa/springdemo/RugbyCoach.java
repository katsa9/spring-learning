package com.katsa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {
	private FortuneService fortuneService;

	/**Configures constructor injection and 'wires' the components together **/
	@Autowired
	public RugbyCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Tackle him!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
