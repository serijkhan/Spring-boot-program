package in.sameerit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.sameerit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	/*
	 * select * from book where book_price >:price
	 * public List<Book> findByBookPriceGreaterThan(Double price);
	 * 
	 * select * from book where book_price <:price 
	 * public List<Book> findByBookPriceLessThan(Double price);
	 * 
	 * select * from book where book_name = bookName
	 * public List<Book> findByBookName(String bookName);
	 */
	
//	@Query(value ="select * from book", nativeQuery = true)
//	public List<Book> getAllBook();
//	

}
