package in.sameerit.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Person {
	
	private Integer personPid;
	private String personName;
	private String gender;
	private Long phno;
	private Date dob;
	public void setPersonPid(int i) {
		// TODO Auto-generated method stub
		
	}

}
