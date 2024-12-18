package in.sameerit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccountPk implements Serializable{
	
	private Long accNum;
	
	private String accType;
	
	

}
