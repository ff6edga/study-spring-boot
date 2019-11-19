package study.spring.boot.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 위의 하나의 어노테이션과 아래 3개의 어노테이션 사용은 동일하다.
//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Demo1Application.class);
		application.run(args);
		//SpringApplication.run(Demo1Application.class, args);
	}

}
