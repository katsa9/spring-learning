package com.katsa.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp2 {
	public static void main(String[] args) {
		
		//read spring config from java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//bean id used to get the bean is the method name used to define the bean
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println("For the swim coach with beans configured in java codes: \n");
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		context.close();
	}
}
