package in.sameerit.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements ApplicationRunner{
	
	public void run(ApplicationArguments args) throws Exception{
		System.out.println("AppRunner... run () method...");
	}
	
	}


