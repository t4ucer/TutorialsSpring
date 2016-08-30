package lkozlows.com;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkou() {
		return "Practive your forehand valley";
	}

}
