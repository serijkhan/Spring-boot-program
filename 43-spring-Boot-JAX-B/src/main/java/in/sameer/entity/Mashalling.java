package in.sameer.entity;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class Mashalling {
	
	public static void main(String[] args) throws Exception{
		Student s = new Student();
		s.setId(101);
		s.setName("Sameer");
		s.setGender("Male");
		s.setEmail("sameer@gmail.com");
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(s, new File("student.xml"));
		
		System.out.println("Done ......!!");
		
	}

}
