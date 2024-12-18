package in.sameer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
