package in.sameer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {
		return "Welcome to Varansi";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		
		model.addAttribute("msg","Good Evening");
		
		return "index";
	}

}
