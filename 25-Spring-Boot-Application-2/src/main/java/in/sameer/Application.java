package in.sameer;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.sameer.bean.Customer;
import in.sameer.repo.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctnx = SpringApplication.run(Application.class, args);
		CustomerRepository bean = ctnx.getBean(CustomerRepository.class);
		
		Customer c = new Customer();
		c.setGender("Male");
		
		Example<Customer> of = Example.of(c);
		 List<Customer> findAll = bean.findAll();
		findAll.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		/*
		 * List<Customer> findAll = bean.findAll(Sort.by("name"));
		 * findAll.forEach(System.out::println);
		 * 
		 * List<Customer> findAll2 = bean.findAll(Sort.by("id").descending());
		 * findAll2.forEach(System.out::println);
		 */
		
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Enter Number"); int
		 * page = s.nextInt();
		 * 
		 * int page1 =3;
		 * 
		 * PageRequest of = PageRequest.of(page - 1,page1); Page<Customer> findAll =
		 * bean.findAll(of); List<Customer> content = findAll.getContent();
		 * content.forEach(System.out::println);
		 */
	}

}
