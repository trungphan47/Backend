package com.demoyourself;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PeopleConfig.class);

		Student student = context.getBean("student", Student.class);
		System.out.println(student.getName());

		System.out.println(student.getDailyFortune());

		Student student1 = context.getBean("studentTrung", Student.class);

		System.out.println(student1.getName());

		System.out.println(student1.getDailyFortune());
		context.close();

//		C1:
	}

}
