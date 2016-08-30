package lkozlows.com;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		String[] threeF = new String[4];
		threeF[0] = "1st fortune: You will get very lucky";
		threeF[1] = "2nd fortune: You will get very bad";
		threeF[2] = "3rd fortune: Normal day";
		threeF[3] = "4th fortune: Standard day";
		
		Random rand = new Random();
		int max=3;
		int min=0;
				
	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min)+1) + min;
		System.out.println(randomNum);
		return threeF[randomNum];
	}

}
