package lkozlows.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);	

		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		
	
	}
}
