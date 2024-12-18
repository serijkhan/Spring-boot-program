package in.sameer.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="CUSTOMER_DTLS")
public class Customer {
	
	public Customer() {
		
	}
	
	@Id
	private int id;
	private String name;
	private String gender;
	private String phoneno;
	
	public Customer(int id, String name, String gender, String phoneno) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phoneno = phoneno;
		
		
	}
	
	

}
