package in.sameerit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.sameerit.entity.Employee;
import in.sameerit.repo.EmployeeRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		
		/*
		 * Employee e2=new Employee(2, "Mantoo", 6000.00, "Male", "HR"); Employee e3=new
		 * Employee(3, "Ashish", 7000.00, "Male", "Engineer"); Employee e4=new
		 * Employee(4, "Amjad", 5800.00, "Male", "Clother"); Employee e5=new Employee(5,
		 * "Ashraf", 78000.00, "Male", "Busness"); Employee e6=new Employee(6,
		 * "Shamsul", 98000.00, "Male", "Conductor");
		 * repository.saveAll(Arrays.asList(e2,e3,e4,e5,e6));
		 * System.out.println("Record Saved....");
		 */
		
		/*
		 * Sort sort = Sort.by("empName","empSalary").descending(); int pageNo = 3;
		 * 
		 * PageRequest page = PageRequest.of(pageNo-1,3);
		 * 
		 * Page<Employee> findAll = repository.findAll(page); List<Employee> emps =
		 * findAll.getContent();
		 * 
		 * emps.forEach(System.out::println);
		 */	
		
		/*
		 * Employee emp = new Employee(); emp.setEmpGender("Male"); emp.setDept("HR");
		 * 
		 * Example<Employee> of = Example.of(emp); List<Employee> emps =
		 * repository.findAll(of);
		 * 
		 * emps.forEach(System.out::println);
		 */
		Employee emp = new Employee();
		// stu.setStuId(102);
		 emp.setEmpName("Sameer");
		 emp.setDept("HR");
		 emp.setEmpGender("Male");
		 
		  emp = repository.save(emp);
		  
		  System.out.println("Record Inserted...");
		
	
	}

}
