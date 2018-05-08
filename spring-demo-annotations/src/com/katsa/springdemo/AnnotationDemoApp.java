package com.katsa.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/**Explicit bean id **/
//		Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach rugbyCoach = context.getBean("rugbyCoach", Coach.class);
		Coach squashCoach = context.getBean("squashCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(rugbyCoach.getDailyWorkout());
		System.out.println(rugbyCoach.getDailyFortune());
		System.out.println(squashCoach.getDailyWorkout());
		System.out.println(rugbyCoach.getDailyFortune());
		context.close();
	}

}
