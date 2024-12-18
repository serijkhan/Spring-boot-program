package in.sameer.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer personId;
	private String personName;
	private String personGender;
	
	@OneToOne(mappedBy="person", cascade= CascadeType.ALL, fetch= FetchType.EAGER)
	private Passport passport;
}
