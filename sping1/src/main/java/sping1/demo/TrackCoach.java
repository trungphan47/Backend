package sping1.demo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
//	public TrackCoach() {
//	}
//	
//	public TrackCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getForturn();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	//add a init method
	public void doMyStartStuff() {
		
		System.out.println("Trackcoach:inside method doMystartSatff");
	}
	
public void doMyCleanupStuffYo() {
		
		System.out.println("Trackcoach:inside method doMyCleanupSatff");
	}
}
