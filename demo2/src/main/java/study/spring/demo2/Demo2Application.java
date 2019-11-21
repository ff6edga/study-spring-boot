package study.spring.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {

	@GetMapping("/hello")
	public String hello() {
		return "hello string";
	}
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Demo2Application.class);
		//app.setWebApplicationType(WebApplicationType.SERVLET);
		//app.addListeners(new SampleListener());
		app.run(args);
	}

}
