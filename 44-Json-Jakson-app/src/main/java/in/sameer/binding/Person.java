package in.sameer.binding;

import lombok.Data;

@Data
public class Person {
	
	private String name;
	private String from;
	private String to;
	private String gender;
	private Address addr;

}
