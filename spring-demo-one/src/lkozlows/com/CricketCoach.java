package lkozlows.com;

public class CricketCoach implements Coach {

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
