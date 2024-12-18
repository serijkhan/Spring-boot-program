package in.sameerit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.Account;
import in.sameerit.entity.AccountPk;

public interface AccountRepo extends JpaRepository<Account, AccountPk> {
	
	

}
