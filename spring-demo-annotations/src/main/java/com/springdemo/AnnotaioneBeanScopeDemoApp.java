package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaioneBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach theCoach1=context.getBean("tennisCoach",Coach.class);
		
		boolean result=(theCoach==theCoach1);
		
		System.out.println(result);
	}

}
