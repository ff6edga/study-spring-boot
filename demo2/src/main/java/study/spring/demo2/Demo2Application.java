package study.spring.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo2Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Demo2Application.class);
		app.run(args);
	}
}
