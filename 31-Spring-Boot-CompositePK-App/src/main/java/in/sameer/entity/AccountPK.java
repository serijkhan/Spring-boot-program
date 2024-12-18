package in.sameer.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AccountPK implements Serializable{
	
	private Integer accId;
	private String  accType;
	private long accNum;

}
