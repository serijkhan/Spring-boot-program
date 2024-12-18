package in.sameerit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean, DisposableBean{
      
	// aproach -1= Declarative
	/*public void init() {
		System.out.println("getting db connection...");
	}*/
	
	// approach 2- programmatic 
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method...");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("destroy method...");
		
	}
	
	
	public void getData() {
		System.out.println("getting data from bd...");
	}
	
	/*public void destroy() {
		System.out.println("closing db connection...");
	}*/
}
