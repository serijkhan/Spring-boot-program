package in.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sameer.User;
import in.sameerit.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;

	    public User saveUser(User user) {
	        return userRepository.save(user);
	    }

		

}
