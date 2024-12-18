package in.sameerit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="stu_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer  stuId;
	private String  stuName;
	private Double  stuSalary;
	private String  stuGender;
	private String dept;

	@CreationTimestamp
	@Column(name="date_created", updatable= false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name="last_updated", insertable=false)
	private LocalDate lastUpdate;
}
