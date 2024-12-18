package in.sameer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {
		String msg = "Welcome to SamSoft";
		
		int i =10/0;
		return msg;
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMsg() {
		String msg = "Good After-Noon";
		return msg;
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ModelAndView handlerAE(ArithmeticException ex) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error");
		
		return mav;
	}

}
