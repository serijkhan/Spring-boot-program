package in.sameerit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sameerit.entity.Account;
import in.sameerit.entity.AccountPk;
import in.sameerit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		AccountRepo bean = context.getBean(AccountRepo.class);
		
		
		//setting composite key value
		AccountPk pk = new AccountPk();
		pk.setAccNum((long) 70076625);
		pk.setAccType("Saving");
		
		//setting entity data
		Account acc = new Account();
		acc.setHolderName("mantooo");
		acc.setBranch("Delhi");
		acc.setAccountPk(pk);   //setting pk obj
		
		bean.save(acc);        // saving the entity obj
		
		System.out.println("Record Saved...");
		
		
		/*
		AccountPk pk = new AccountPk();
		pk.setAccNum((long) 70076625);
		pk.setAccType("Saving");
		
		Optional<Account> findById = bean.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
			*/
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


