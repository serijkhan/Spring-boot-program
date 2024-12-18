package in.sameerit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.sameerit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	
	  @Query(value ="select * from stu_tbl", nativeQuery=true)
	  public List<Student>getstu();
	 
}
