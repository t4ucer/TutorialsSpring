package lkozlows.com;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCouch: inside set email method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCouch: inside set team method");
		this.team = team;
	}
	
	
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}




	private FortuneService fortuneService;

	public CricketCoach(){
		System.out.println("Cricket Coach constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCouch: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
