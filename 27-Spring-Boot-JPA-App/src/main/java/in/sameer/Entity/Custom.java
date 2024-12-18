package in.sameer.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="CUSTOM_DTLS")
public class Custom {
	
	@Id
	private Integer id;
	private String name;
	private String gender;
	private String location;
	
	@CreationTimestamp
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	private String activeSW;
	
	public Custom() {
		
	}

	public Custom(int id, String name, String gender, String location,String activeSW) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.location = location;
		this.activeSW = activeSW;
	}
	
	
	
	
	

}
