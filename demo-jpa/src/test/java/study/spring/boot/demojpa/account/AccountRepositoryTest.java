package study.spring.boot.demojpa.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	AccountRepository accountRepository;

	@Test
	public void di() throws SQLException {
		try(Connection connection = dataSource.getConnection()) {
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println(metaData.getURL());
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getUserName());
		}
	}

	@Test
	public void findAccount() throws SQLException {
		Account account = new Account();
		account.setUsername("keesun");
		account.setPassword("pass");

		Account newAccount = accountRepository.save(account);
		assertThat(newAccount).isNotNull();

		//Optional로 받아올 수도 있는데 이 때는 isEmpty / isNotEmpty 로 확인한다.
		Account existingAccount = accountRepository.findByUsername(newAccount.getUsername());
		assertThat(existingAccount).isNotNull();

		Account nonExistingAccount = accountRepository.findByUsername("whatThe");
		assertThat(nonExistingAccount).isNotNull();
	}

}