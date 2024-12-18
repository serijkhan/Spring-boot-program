package in.sameerit.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements InitializingBean{
      
	public void afterPropertiesSet() throws Exception {
		System.out.println("get data from database...");
		System.out.println("store data into redis...");
	}
	
	
	
	
}
