package study.spring.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Demo2Runner implements ApplicationRunner {

	@Autowired
	YounsooProperties props;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=====================");
		System.out.println(props.getName());
		System.out.println(props.getAge());
		System.out.println(props.getSessionTimeout());
		System.out.println("=====================");
	}
}
