package in.sameerit;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("userDao")
public class UserService {
	
	public UserService() {
		System.out.println("getting data from redis...");
	}

}
