package study.spring.demo2;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@SpringBootTest(properties = "younsoo.age=1")
// or @TestPropertySource(properties = "younsoo.age=2")
@SpringBootTest
@TestPropertySource(locations = "classpath:/test.properties")
class Demo2ApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
		assertThat(environment.getProperty("younsoo.name"))
				.isEqualTo("TEST_NAME");
	}

}
