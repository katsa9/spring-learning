package com.katsa.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp2 {
	public static void main(String[] args) {
		
		//read spring config from java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		/**Explicit bean id **/
//		Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach rugbyCoach = context.getBean("rugbyCoach", Coach.class);
		Coach squashCoach = context.getBean("squashCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(rugbyCoach.getDailyWorkout());
		System.out.println(rugbyCoach.getDailyFortune());
		
		System.out.println("For the squash coach with random fortunes from file: \n");
		System.out.println(squashCoach.getDailyWorkout());
		System.out.println(squashCoach.getDailyFortune());
		System.out.println(squashCoach.getDailyFortune());
		System.out.println(squashCoach.getDailyFortune());
		context.close();
	}
}
