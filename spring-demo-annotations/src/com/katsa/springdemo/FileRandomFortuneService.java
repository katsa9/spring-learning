package com.katsa.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileRandomFortuneService implements FortuneService {
@Value("${katsa.fortune1}")
private String fortune1;

@Value("${katsa.fortune2}")
private String fortune2;

@Value("${katsa.fortune3}")
private String fortune3;

@Value("${katsa.fortune4}")
private String fortune4;

private List<String> fortunes;
	
	public FileRandomFortuneService() {
		fortunes = new ArrayList<String>();
	}
	
	@PostConstruct
	private final void loadFortunes() {
		fortunes.add(fortune1);
		fortunes.add(fortune2);
		fortunes.add(fortune3);
		fortunes.add(fortune4);
	}
	
	@Override
	public String getFortune() {
		return fortunes.get(new Random().nextInt(4));
	}
}
