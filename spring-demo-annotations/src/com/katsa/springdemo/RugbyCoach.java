package com.katsa.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Tackle him!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
