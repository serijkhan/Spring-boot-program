package in.sameerit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sameerit.config.AppConfig;

public class App {
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
