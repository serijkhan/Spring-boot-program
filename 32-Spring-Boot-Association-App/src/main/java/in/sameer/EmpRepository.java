package in.sameer;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
