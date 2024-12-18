package in.sameer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
	

}
