package in.sameer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
