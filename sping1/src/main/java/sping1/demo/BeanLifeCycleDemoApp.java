package sping1.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach1", Coach.class);

	System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
