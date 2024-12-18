package in.sameer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Integer>{

}
