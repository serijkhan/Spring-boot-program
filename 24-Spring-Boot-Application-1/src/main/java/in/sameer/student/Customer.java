package in.sameer.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="CUSTOMER_DTLS")
public class Customer {
	
	@Id
	private int id;
	private String name;
	private String gender;
	private String location;

}
