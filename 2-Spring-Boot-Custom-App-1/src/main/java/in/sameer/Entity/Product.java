package in.sameer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="PRODUCT_DTLS")
public class Product {
	
	@Id
	private int id;
	private String name;
	private String gender;
	private String location;
	
	
	public Product(int id, String name, String gender, String location) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.location = location;
	}
	
	public Product() {
		
	}
	
	

}
