package com.katsa.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService2 implements FortuneService {

	private final String fileName = "D:\\Learning\\Spring and Hibernate Udemy course\\repository\\spring-learning\\spring-demo-annotations\\src\\fortune_data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();

	public FileFortuneService2() {

		System.out.println(">> FileFortuneService: inside default constructor");
		
	}

	@PostConstruct
	private void loadTheFortunesFile() {
		
		System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");

		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}
}
