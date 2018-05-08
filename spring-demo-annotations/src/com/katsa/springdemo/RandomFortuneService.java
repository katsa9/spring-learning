package com.katsa.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService{
	private List<String> fortunes = new ArrayList<>();
	
	public RandomFortuneService() {
		fortunes.add("Fortune 1");
		fortunes.add("Fortune 2");
		fortunes.add("Fortune 3");
	}

	@Override
	public String getFortune() {
		return fortunes.get(new Random().nextInt(3));
	}

}
