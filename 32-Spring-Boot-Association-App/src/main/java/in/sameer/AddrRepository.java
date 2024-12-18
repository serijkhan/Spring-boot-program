package in.sameer;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.entity.Address;

public interface AddrRepository extends JpaRepository<Address,Integer>{

}
