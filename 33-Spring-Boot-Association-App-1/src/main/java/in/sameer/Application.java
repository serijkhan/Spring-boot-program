package in.sameer;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.entity.Passport;
import in.sameer.entity.Person;
import in.sameer.repo.PassRepository;
import in.sameer.repo.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PassRepository bean = context.getBean(PassRepository.class);
		PersonRepository bean2 = context.getBean(PersonRepository.class);
		
		/*Person p = new Person();
		p.setPersonName("Mantoo");
		p.setPersonGender("Male");
		
		Passport p1 = new Passport();
		p1.setPassportName("Sameer");
		p1.setIssueDate(LocalDate.now());
		p1.setExpiryDate(LocalDate.now().plusYears(10));
		p.setPassport(p1);
		p1.setPerson(p);*/
		
		bean2.findById(1);
		System.out.println("Retrive Record ...");
	}

}
