package study.spring.boot.demoneo4j;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import study.spring.boot.demoneo4j.account.Account;
import study.spring.boot.demoneo4j.account.AccountRepository;
import study.spring.boot.demoneo4j.account.Role;

@Component
public class Neo4jRunner implements ApplicationRunner {

//	@Autowired
//	SessionFactory sessionFactory;

	@Autowired
	AccountRepository accountRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Account account = new Account();
		account.setEmail("whoami@mail.com");
		account.setUsername("edga");

		Role role = new Role();
		role.setName("admin");

		account.getRoles().add(role);

//		Session session = sessionFactory.openSession();
//		session.save(account);
//		sessionFactory.close();

		accountRepository.save(account);
		System.out.println("finished");

	}
}
