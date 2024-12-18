package in.sameer.binding;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Student {
	
	private Integer id;
	private String name;
	private String gender;
	private String email;

}
