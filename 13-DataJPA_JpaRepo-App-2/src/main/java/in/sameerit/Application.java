package in.sameerit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameerit.entity.Student;
import in.sameerit.repo.StudentRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		 Student stu = new Student();
		 stu.setStuId(102);
		 stu.setStuName("Sameer");
		 stu.setDept("HR");
		 stu.setStuGender("Male");
		 
		  stu = repository.save(stu);
		  
		  System.out.println("Record Inserted...");
		
		
		
		
	}

}
