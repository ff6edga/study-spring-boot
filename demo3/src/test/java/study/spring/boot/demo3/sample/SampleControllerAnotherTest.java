package study.spring.boot.demo3.sample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerAnotherTest {

	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	@Autowired
	TestRestTemplate testRestTemplate;

	@Autowired
	WebTestClient webTestClient;

	@MockBean
	SampleService mockSampleService;

	@Test
	public void hello() throws Exception {
		when(mockSampleService.getName()).thenReturn("younsoo");

		String result = testRestTemplate.getForObject("/hello", String.class);
		assertThat(result).isEqualTo("hello younsoo");
	}

	@Test
	public void hello2() throws Exception {
		when(mockSampleService.getName()).thenReturn("younsoo");

		webTestClient.get().uri("/hello").exchange()
				.expectStatus().isOk()
				.expectBody(String.class).isEqualTo("hello younsoo");

		assertThat(outputCapture.toString())
				.contains("holoman")
				.contains("skip");
	}
}
