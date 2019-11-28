package study.spring.boot.demoh2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class MySQLRunner implements ApplicationRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try(Connection connection = dataSource.getConnection()) {
			System.out.println(connection.getClass()); // 어떤 DBCP를 쓰는지 확인
			System.out.println(connection.getMetaData().getURL());
			System.out.println(connection.getMetaData().getUserName());

//			Statement statement = connection.createStatement();
//			String sql = "CREATE TABLE USER (ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY\n"
//					+ "KEY (id))";
//			statement.executeUpdate(sql);
		}
		// JdbcTemplate가 훨씬 간결하게 SQL을 사용할 수 있고, 좀 더 안전하게
		// 사용할 수 있으며 Resource 반납 처리도 잘 되어 있으며
		// 훨씬 가독성 좋은 예외 처리를 할 수 있다.
//		jdbcTemplate.execute("INSERT INTO USER VALUES(1, 'younsoo')");
	}
}
