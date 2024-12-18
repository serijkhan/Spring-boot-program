package in.sameer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.entity.Student;
import in.sameer.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository bean = context.getBean(StudentRepository.class);
		
		Student s = new Student();
		s.setName("Sameer");
		s.setGender("Male");
		s.setSalary(1254.0);
		
		bean.save(s);
		System.out.println("Recored Inserted.....");
	}

}
