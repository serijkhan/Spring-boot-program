package in.sameer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.entity.Passport;

public interface PassRepository extends JpaRepository<Passport,Integer> {

}
