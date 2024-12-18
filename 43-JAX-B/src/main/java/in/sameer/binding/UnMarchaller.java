package in.sameer.binding;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class UnMarchaller {
	public static void main(String[] args)throws Exception {
		
           File f = new File("student.xml");
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Object object = unmarshaller.unmarshal(f);
		
		Student c = (Student)object;
		
		System.out.println(c);
	}

}
