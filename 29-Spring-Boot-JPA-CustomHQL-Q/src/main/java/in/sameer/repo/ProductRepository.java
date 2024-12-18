package in.sameer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.sameer.entity.Product;
import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	@Query(value="insert into product(id,name,gender,location) values(:id,:name,:gender,:location)", nativeQuery=true)
	@Modifying
	@Transactional
	public void insertProduct(Integer id, String name, String gender,String location);
	
	@Query("update Product set gender=:gender where id=:pid")
	@Modifying
	@Transactional
	public void updateProduct(Integer id, String gender);
	
	@Query("delete from Product where id=:sid")
	@Modifying
	@Transactional
	public void deleteProduct(Integer pid);
	
	
	@Query("from Product")
	public void selectProduct();

}
