package in.sameer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.sameer.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{
	
//	public List<Student> findByGender(String gender);
//	public List<Student> findByIdGreaterThanEqual(Integer id);
//	public List<Student> findByIdIsLessThanEqual(Integer id);
//	public List<Student> findByGenderAndIdGreaterThanEqual(String gender, Integer id);
    
//	@Query(value ="select * from student_dtls", nativeQuery=true)
//	public List<Student> getAllStudents();
	
	@Query("from student")
	public List<Student> getStudents();
}
