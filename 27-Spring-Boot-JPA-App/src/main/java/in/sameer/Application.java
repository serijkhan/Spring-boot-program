package in.sameer;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.Entity.Custom;
import in.sameer.repo.CustomRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CustomRepository bean = context.getBean(CustomRepository.class);
		
		  
		
		  Custom custom = bean.findById(01).get(); custom.setActiveSW("N");
		  
		  bean.save(custom);
		 
		 

		/*
		 * Custom c = new Custom(01,"Sameer","Male","HYD","Y");
		 * 
		 * bean.save(c);
		 * 
		 * System.out.println("Recored Inserted ......");
		 */
	}

}
