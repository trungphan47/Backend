package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService thefortuneService) {
//
//		fortuneService = thefortuneService;
//	}

	public TennisCoach() {

		System.out.println("alo alo");
	}

	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println("dmmmmmm");
	}
	//destroy method
	@PreDestroy
public void doMyCleanUpStuff() {
		
		System.out.println("hello baby");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pracite your bachkand volley";
	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("mấy con gà");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	// define method
	
	
	
}
