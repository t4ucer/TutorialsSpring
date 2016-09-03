package lkozlows.com;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create array of strings	
	private String[] data = {
			"1st fortune",
			"2nd fortune",
			"3rd fortune"};
	
	//create a random number generator
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
