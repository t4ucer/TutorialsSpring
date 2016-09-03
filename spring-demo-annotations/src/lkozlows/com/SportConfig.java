package lkozlows.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//add support to resolve ${...} properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public FortuneService happyFortuneService(){
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(happyFortuneService());
		}
	
	
	

}
