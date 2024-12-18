package in.sameerit.comtroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	
	@GetMapping("/greet")
	public String getgreetMsg(Model model) {
		String msgtxt = "Welcome to dln..!!";
		model.addAttribute("msg",msgtxt);
		return "index";
	}
	
	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		String msgtxt = "Good Evening..!!";
		int i =10/0;
		model.addAttribute("msg",msgtxt);
		return "index";
	}
	
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleAE(ArithmeticException ae) {
		String msg = ae.getMessage();
		return "errorPage";
		
	}
	
}
