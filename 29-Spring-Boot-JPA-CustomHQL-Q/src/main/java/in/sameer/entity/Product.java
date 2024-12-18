package in.sameer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	private Integer id;
	private String name;
	private String gender;
	private String location;

	public Product() {

	}

	public Product(Integer id, String name, String gender, String location) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.location = location;
	}

}
