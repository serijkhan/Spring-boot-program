package in.sameerit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
