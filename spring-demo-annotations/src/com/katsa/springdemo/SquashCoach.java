package com.katsa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements Coach {
	/**
	 * Field injection - happens using java reflection
	 */
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public SquashCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Hit the ball against the wall!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
