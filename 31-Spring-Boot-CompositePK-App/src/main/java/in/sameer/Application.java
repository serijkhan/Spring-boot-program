package in.sameer;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameer.entity.Account;
import in.sameer.entity.AccountPK;
import in.sameer.repo.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountRepository bean = context.getBean(AccountRepository.class);
		
		
		  AccountPK pk = new AccountPK(); pk.setAccId(11); pk.setAccType("current");
		  pk.setAccNum(69569l); Optional<Account> findById = bean.findById(pk);
		  System.out.println(findById.get());
		 
		
		
		
		
		
		/*
		 * AccountPK pk = new AccountPK(); pk.setAccId(11); pk.setAccType("current");
		 * pk.setAccNum(69569l);
		 * 
		 * Account acc = new Account(); acc.setHolderName("Sameer");
		 * acc.setBranchName("DLN"); acc.setAccountPk(pk);
		 * 
		 * bean.save(acc);
		 */
	}

}
