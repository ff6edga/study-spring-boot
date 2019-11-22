package study.spring.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Demo2Runner implements ApplicationRunner {

	@Value("${younsoo.fullName}")
	private String name;

	@Value("${younsoo.age}")
	private Integer age;



	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=====================");
		System.out.println(name);
		System.out.println(age);
		System.out.println("=====================");
	}
}
