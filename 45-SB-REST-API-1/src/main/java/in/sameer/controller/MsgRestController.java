package in.sameer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	public MsgRestController() {
		System.out.println("Zero-Param-Constructor");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg ="Welcome to Varansi City";
		
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg="Good Evening Sam";
		return msg;
	}

}
