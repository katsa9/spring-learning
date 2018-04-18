package com.katsa.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It will be a good day";
	}

}
