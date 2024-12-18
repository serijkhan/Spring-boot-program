package in.sameer;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.entity.Address;
import in.sameer.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		/*Employee e = new Employee();
		e.setEmpName("Sameer");
		e.setEmpSalary(4000.00);
		
		
		Address a = new Address();
		a.setCity("Ghazipur");
		a.setState("UP");
		a.setCountry("INDIA");
		a.setEmp(e);
		
		Address a1 = new Address();
		a1.setCity("Chennai");
		a1.setState("TM");
		a1.setCountry("INDIA");
		a1.setEmp(e);
		
		List<Address> list = Arrays.asList(a,a1);
		e.setAddr(list);*/
		
		EmpRepository bean = context.getBean(EmpRepository.class);
		bean.findById(1);
		
		
		System.out.println("Retrive Records .....");
	}

}
