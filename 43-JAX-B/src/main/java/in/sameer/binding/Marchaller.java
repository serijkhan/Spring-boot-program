package in.sameer.binding;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class Marchaller {
	public static void main(String[] args) throws Exception{
		
		Student s = new Student();
		s.setId(101);
		s.setName("Sameer");
		s.setGender("Male");
		s.setEmail("samsoft@Gmail.com");
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(s, new File("student.xml"));
		
		System.out.println("Done.....!!");
	}

}
