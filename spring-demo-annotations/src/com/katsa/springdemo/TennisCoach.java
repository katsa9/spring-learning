package com.katsa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**Using default bean id (tennisCoach) -> class name with first letter lowercase**/
@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;

	
	public TennisCoach() {
		System.out.println("inside default constructor - tennis coach");
	}

	@Override
	public String getDailyWorkout() {
		return "hit the ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	/**Configures setter injection 
	 * Using the Autowired annotation on any method will cause it to be used for dependency injection for the class. It doesn't
	 * need to be a setter method.
	 * **/
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setting fortune service - tennis coach");
		this.fortuneService = fortuneService;
	}
	
}

/**Explicit bean id **/
//@Component("thatSillyCoach")
//public class TennisCoach implements Coach {
//
//	@Override
//	public String getDailyWorkout() {
//		return "hit the ball";
//	}
//}
