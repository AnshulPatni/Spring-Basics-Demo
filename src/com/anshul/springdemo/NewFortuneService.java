package com.anshul.springdemo;

import java.util.Random;

public class NewFortuneService implements FortuneService {
	
	private String[] fortunes = new String[]{
			"You're amazing!",
			"Be honest!",
			"Have fun!"
	};
	
	private int rnd = new Random().nextInt(fortunes.length);
	
	@Override
	public String getFortune() {
		// TODO When the getFortune() method is called it should return a random fortune from the array
		return fortunes[rnd];
	}

}
