package sping1.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach1", Coach.class);

		Coach alphaCoach = context.getBean("myCoach1", Coach.class);
		
		// check if they are the same
		boolean result=(theCoach==alphaCoach);
		
		//print out the result
		System.out.println("\nPointting to the same obj "+result);
		
		System.out.println("\nMemory location for the Coach"+theCoach);
		
		System.out.println("\nMemory location for alphaCoach"+alphaCoach);
		
		context.close();

	}

}
