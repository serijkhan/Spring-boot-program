package in.sameerit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
