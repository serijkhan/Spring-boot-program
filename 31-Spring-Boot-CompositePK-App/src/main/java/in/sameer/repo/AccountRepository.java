package in.sameer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameer.entity.Account;
import in.sameer.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{

}
