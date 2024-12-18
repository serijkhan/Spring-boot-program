package in.sameer.Json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sameer.binding.Address;
import in.sameer.binding.Person;

public class JavaToJackson {
	
	public static void main(String[] args) throws Exception{
		
		Address addr = new Address();
		addr.setCity("Dln");
		addr.setState("UP");
		addr.setCountry("INDIA");
		
		Person p = new Person();
		p.setName("Mantoo");
		p.setFrom("Uk");
		p.setTo("USA");
		p.setGender("Male");
		p.setAddr(addr);
		
		ObjectMapper ob = new ObjectMapper();
		ob.writeValue(new File("person.json"),p);
		
		System.out.println("Done.....!!!!");
		
	}

}
