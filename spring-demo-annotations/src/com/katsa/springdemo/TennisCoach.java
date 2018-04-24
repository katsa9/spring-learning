package com.katsa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**Using default bean id (tennisCoach) -> class name with first letter lowercase**/
@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;

	
	/**Configures constructor injection and 'wires' the components together **/
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "hit the ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
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
