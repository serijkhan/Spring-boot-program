package in.sameerit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(Application.class, args);
		Car c = ctx.getBean(Car.class);
		System.out.println(c.hashCode());
	}

}
