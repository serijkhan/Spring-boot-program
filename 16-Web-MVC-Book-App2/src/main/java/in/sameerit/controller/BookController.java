package in.sameerit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sameerit.entity.Book;
import in.sameerit.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		
		ModelAndView mav = new ModelAndView();
		Optional<Book> findById = repo.findById(id);
		if(findById.isPresent()) {
			Book bookObj = findById.get();
			
			mav.addObject("book",bookObj);
		}
		
		mav.setViewName("index");
		
		return mav;
		
	}

}
