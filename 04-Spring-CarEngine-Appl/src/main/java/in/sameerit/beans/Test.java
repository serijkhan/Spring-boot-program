package in.sameerit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		Car c = ctxt.getBean(Car.class);
		c.drive();
		
	}

}
