package in.sameer.Json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sameer.binding.Person;

public class JackonToJava {
	public static void main(String[] args)throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		Person value = mapper.readValue(new File("person.json"),Person.class);
		
		System.out.println(value);
		
	}

}
