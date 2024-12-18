package in.sameer.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.sameer.student.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
