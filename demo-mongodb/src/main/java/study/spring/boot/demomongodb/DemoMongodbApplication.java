package study.spring.boot.demomongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class DemoMongodbApplication {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoMongodbApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {
			Account account = new Account();
			account.setEmail("younsoo@naver.com");
			account.setUsername("KYS");

			//mongoTemplate.insert(account);
			accountRepository.insert(account);

			System.out.println("finished");
		};
	}
}
