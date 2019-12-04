package study.spring.boot.demosecurity2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import study.spring.boot.demosecurity2.account.Account;
import study.spring.boot.demosecurity2.account.AccountService;

@Component
public class AccountRunner implements ApplicationRunner {

	@Autowired
	AccountService accountService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Account younsoo = accountService.createAccount("younsoo", "1212");
		System.out.println(younsoo.getUsername() + " passowrd: " + younsoo.getPassword());
	}
}
