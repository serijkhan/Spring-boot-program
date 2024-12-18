package in.sameer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {
	
	public Student() {
		
	}
	
	public Student(int id, String name, String gender, String location) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.location = location;
	}



	@Id
	@Column(name="student_id")
	private int id;
    
	@Column(name="student_name")
	private String name;
	
	@Column(name="student_gender")
	private String gender;
	
	@Column(name="student_location")
	private String location;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", location=" + location + "]";
	}
	
	
	

}
