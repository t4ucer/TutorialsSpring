package lkozlows.com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
@Autowired
@Qualifier ("randomFortuneService")
	private FortuneService fortuneService;
	public TennisCoach(){
		System.out.println("Default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("Startup");
	}
	
	// define destroy method
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("Destroy");
	}
	
	
	/*
	//Depenendency injection through setter method and Autowire
		@Autowired
	 public void  doSomeCrazyStuff(FortuneService theFortuneService){
		 fortuneService=theFortuneService;
	 }
	*/
	
	/*
	//Dependency injection through constructor and Autowire
	 * @Autowired
 	public TennisCoach(FortuneService theFortuneService)
 	{
 		fortuneService = theFortuneService;
 	}
	 */
	
 
	@Override
	public String getDailyWorkout() {
		return "Practive your forehand valley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
