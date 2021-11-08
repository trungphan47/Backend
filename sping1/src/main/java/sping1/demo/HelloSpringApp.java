package sping1.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
						
				// retrieve bean from spring container
				CriketCoach theCoach = context.getBean("myCoach", CriketCoach.class);
				
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				// let's call our new method for fortunes
				System.out.println(theCoach.getDailyFortune());
			
				//let's call our new method to get the literal values
				System.out.println(theCoach.getEmailAddress());
				System.out.println(theCoach.getTeam());
				// close the context
				context.close();
			}

}
	