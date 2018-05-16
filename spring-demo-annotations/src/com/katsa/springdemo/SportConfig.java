package com.katsa.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //causes this to be the config file for the spring container
//@ComponentScan("com.katsa.springdemo") // sets up component scanning (Autowired)
public class SportConfig {
	
	
	//If more than one implementation available need to add qualifier for injecting dependency
	@Bean
	public Coach swimCoach(@Qualifier("fileFortuneService2") FortuneService fortuneService) { //the method name is the bean id
		//calling the bean method for the fortune service gets a reference to that bean from the spring container
		SwimCoach mySwimCoach  = new SwimCoach(fileFortuneService2());
		
		return mySwimCoach;
	}
	
	@Bean 
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean //the method name is the bean id
	public FortuneService fileFortuneService2() {
		return new FileFortuneService2();
	}

}
