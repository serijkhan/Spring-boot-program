package in.sameer.repo;

import org.springframework.data.repository.CrudRepository;

import in.sameer.Entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

}
