package in.sameer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	
	@GetMapping("/car/{carId}/hyd")
	public ModelAndView getCarColor(@PathVariable Integer carId) {
		ModelAndView mav = new ModelAndView();
		
		String color=null;
		
		if(carId>=100) {
			color="Red";
		}else {
			color="Black";
		}
		
		mav.addObject("msg" ,"car color is"+ color);
		mav.setViewName("index");
		
		
		return mav;
	}
	
	@GetMapping("stock/{brand}/location/{loc}")
	public ModelAndView getCarStock(@PathVariable String brand, String loc) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg" ,"is"+ loc + " " + brand + "is Out Of Stock ");
		mav.setViewName("index");
		
		
		return mav;
	}


}
