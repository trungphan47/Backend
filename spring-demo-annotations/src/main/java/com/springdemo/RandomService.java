package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	private String[] data = { "ăn", "ngủ", "học", "chơi"

	};
// create the random number generator
	private Random random=new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = random.nextInt(data.length);
		String theFortune=data[index];
		
		return theFortune;
	}

}
