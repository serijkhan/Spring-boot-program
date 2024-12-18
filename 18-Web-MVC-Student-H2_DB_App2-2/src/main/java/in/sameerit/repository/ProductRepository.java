package in.sameerit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
