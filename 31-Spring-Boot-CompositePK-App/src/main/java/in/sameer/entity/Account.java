package in.sameer.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Account {
	
	private String holderName;
	private String branchName;
	
	@EmbeddedId
	private AccountPK accountPk;
	
	

}
