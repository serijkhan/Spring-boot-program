package in.sameerit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public String m1(Model model) {
		model.addAttribute("msg","Good Night");
		return "index";
	}

}
