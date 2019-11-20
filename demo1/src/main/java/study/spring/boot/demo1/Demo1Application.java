package study.spring.boot.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import study.spring.boot.Holoman;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Demo1Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

//	@Bean
//	public Holoman holoman() {
//		Holoman holoman = new Holoman();
//		holoman.setName("whiteship");
//		holoman.setHowLong(60);
//		return holoman;
//	}
}
