package in.sameer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sameer.binding.Customer;

@RestController
public class CustomerRestController {
	
	@GetMapping(
			value ="/customer",
			produces= {"application/xml","application/json"}
			)
	public Customer getCustomerMsg() {
		
		Customer a = new Customer();
		a.setName("Sameer");
		a.setEmail("myfatherseraj@gmail.com");
		a.setGender("Male");
		
		return a;
		
	}
	
	public ResponseEntity<String> addCustomer(Customer customer) {
		System.out.println(customer);
		return new ResponseEntity<>("Customer Saved",HttpStatus.CREATED);
	}

}
