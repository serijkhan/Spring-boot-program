package in.sameerit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameerit.entity.Book;
import in.sameerit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

		
		/*
		 * Book b1 = new Book(); b1.setBookId(104); b1.setBookName("Ashish");
		 * b1.setBookPrice(4587.00);
		 * 
		 * Book b2 = new Book(); b2.setBookId(105); b2.setBookName("Dallu");
		 * b2.setBookPrice(8000.00);
		 * 
		 * repo.saveAll(Arrays.asList(b1,b2));
		 * 
		 * System.out.println("Record Inserted...");
		 */
		 

		// To check presence of records in DB or Not(Boolean existsById methods)
		
		/*
		 * boolean status = repo.existsById(105);
		 * System.out.println("Record Presence :: "+ status);
		 */

		// count method= to retrive record based on given pk
		 // System.out.println("Records Count::"+ repo.count());

		/*
		 * three methods of findAllId Methods Optional<Book> findById =
		 * repo.findById(101); System.out.println(findById.get());
		 */

		/*
		 * Optional<Book> findById = repo.findById(102); if(findById.isPresent()) {
		 * System.out.println(findById.get());
		 */

		/*
		 * Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,102,103));
		 * for(Book b : findAllById) { System.out.println(b); }
		 */

		/*
		 * Iterable<Book> findAll = repo.findAll(); for(Book b : findAll) {
		 * System.out.println(b); }
		 */
		
		//repo.deleteById(105);
		
		/*
		 * if(repo.existsById(205)) { repo.deleteById(205); }else {
		 * System.out.println("NO Record Founds"); }
		 */
		
		
		
		 /* List<Book> books = repo.getAllBooks(); 
		  for(Book b : books) {
			  System.out.println(b);*/
		  
		  }
	}


