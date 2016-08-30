package lkozlows.com;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicatonContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nResult: "+result);
		
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		System.out.println("\nMemory location for alphaCoach: "+ alphaCoach);
		
		context.close();
		
	}

}
