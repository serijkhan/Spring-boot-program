package in.sameer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String getMsg() {
		log.info("Methods Started .....");
		
		log.info("Methods Ended.....");
		
		return "Welcome to SameerSoft";
	}

}
