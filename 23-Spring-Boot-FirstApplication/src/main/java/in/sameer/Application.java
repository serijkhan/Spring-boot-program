package in.sameer;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.entity.Student;
import in.sameer.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		
		List<Student> students = repository.getStudents();
		students.forEach(System.out::println);
		
		
		
		
//		List<Student> student = repository.getAllStudents();
//		student.forEach(System.out::println);
		
//        List<Student> fd = repository.findByGenderAndIdGreaterThanEqual("Male", 106);
//        fd.forEach(System.out::println);
//		
//		List<Student> fd = repository.findByIdIsLessThanEqual(104);
//		fd.forEach(System.out::println);
		
//		List<Student> findByGender = repository.findByGender("Male");
//		findByGender.forEach(System.out::println);
		
//	    List<Student> id = repository. findByIdGreaterThanEqual(103);
//	    id.forEach(System.out::println);
		
//		Student s1 = new Student(105,"Priya","Female","PPt");
//		Student s2 = new Student(106,"Aditya","Male","Varansi");
//		Student s3 = new Student(107,"Pratik","Male","Patna");
//		Student s4 = new Student(108,"Rumana","Female","Bihar");
//		
//		List<Student> asList = Arrays.asList(s1,s2,s3,s4);
//		repository.saveAll(asList);
//		
//		long count = repository.count();
//		System.out.println("Record Cound" + count);
		//repository.deleteById(200);
//		Student s = new Student();
//		s.setId(102);
//		s.setName("Sana");
//		s.setGender("F");
//		s.setLocation("New Delhi");
//		
//		repository.save(s);rr
//		System.out.println("Record Inserted......");
		
		
//		Optional<Student> id = repository.findById(101);
		
//		if(id.isPresent()) {
//			System.out.println(id.get());
//		}
		
//		Iterable<Student> findAll = repository.findAll();
//		findAll.forEach(s -> System.out.println(s));
		
//		repository.deleteById(101);
//		System.out.println("Delete Record....");
	}

}
