package in.sameer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.repo.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository bean = context.getBean(ProductRepository.class);
		
		//Product p = new Product(02,"Sameer","Male","DLN");
		
		bean.deleteAll();		
		System.out.println("Delete Data for DataBase.....");
	}

}
