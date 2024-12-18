package in.sameer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	@GetMapping("/msg")
	public ModelAndView getMsg(@RequestParam  String name) {
		
		String msgtxt = name + ", Good Evening";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg" ,msgtxt);
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/book")
	public ModelAndView getBookName(@RequestParam  String name, String author) {
		
		System.out.println("Name:"+ name);
		System.out.println("Author:"+ author);
		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg" , name +"By" + author + "This book author is");
		mav.setViewName("index");
		
		return mav;
	}

}
