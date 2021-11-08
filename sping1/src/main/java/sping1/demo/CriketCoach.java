package sping1.demo;

public class CriketCoach implements Coach{

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "ngu";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "vcl";
	}
	public CriketCoach() {
		System.out.println("ahihi");
	}
	
	
public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("hello mitom");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("hello trung phan");
		this.team = team;
	}

public void setFortuneService(FortuneService fortuneService) {
	
	this.fortuneService=fortuneService;
}


}
