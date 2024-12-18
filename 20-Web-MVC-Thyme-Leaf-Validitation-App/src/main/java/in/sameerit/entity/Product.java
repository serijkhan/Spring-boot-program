package in.sameerit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message= "Name is mandatory")
	@Size(min=3, max=15, message="Name should have only 3 to 15 characters")
	private String name;
	
	@NotNull(message="Price is mandatory")
	@Positive(message="price should be positve number")
	private Double price;
	
	@NotNull(message="Quantity is mandatory")
	@Positive(message="quantity should be positive number")
	private Integer qty;

}
