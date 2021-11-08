package sping1.demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneservice;
	
//define a construction for dependency injection
	 public BaseballCoach(FortuneService thefortuneservice) {
		 
		 fortuneservice=thefortuneservice;
	 }
	
	@Override
        public String getDailyWorkout() {
		
		return "Spend 30m on battting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneServvice to get a fortune
		return fortuneservice.getForturn();
	}
	

}
