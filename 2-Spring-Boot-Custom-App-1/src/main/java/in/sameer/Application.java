package in.sameer;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.Entity.Product;
import in.sameer.repo.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnt = SpringApplication.run(Application.class, args);
		ProductRepository bean = cnt.getBean(ProductRepository.class);
		
		
		
		// delete data from DataBase by Delete MEthods
		/*
		 * bean.deleteById(07); System.out.println("Id is delete from Db");
		 */
		
		
		
		
        // update data from database with jpa
		/*
		 * Product p = new Product(); p.setId(01); p.setName("Dallu");
		 * p.setGender("Male"); p.setLocation("HYD");
		 * 
		 * bean.save(p);
		 */
		
		//retrive data from DataBase on readymethod
		/*
		 * Iterable<Product> find = bean.findAll(); find.forEach(System.out::println);
		 */
		
		// insert data on dataBase with the help of CrudRepository
		/*
		 * Product p = new Product(01,"Sameer","Male","HYD"); Product p1 = new
		 * Product(02,"Mantoo","Male","Delhi"); Product p2 = new
		 * Product(03,"Salik","Male","Varansi"); Product p3 = new
		 * Product(04,"Amjad","Male","PPt"); Product p4 = new
		 * Product(05,"Ashraf","Male","Pune"); Product p5 = new
		 * Product(06,"Rubi","FeMale","Chennai"); Product p6 = new
		 * Product(07,"Sana","FeMale","Banglore");
		 * 
		 * List<Product> list = Arrays.asList(p,p1,p2,p3,p4,p5,p6); bean.saveAll(list);
		 * System.out.println("Record Inserted...");
		 */
		
	}

}
