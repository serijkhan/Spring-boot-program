package in.sameerit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.sameerit.beans.Engine;

@Configuration
@ComponentScan(basePackages = {"in.sameerit" ,"com.tcs"})

public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: Constructrors ");
	}
	
	@Bean
	public Engine getEngine() {
		Engine eng = new Engine();
		//logic
		return eng;
		
	}

}
