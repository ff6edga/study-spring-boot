package study.spring.demo2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

	public SampleComponent(ApplicationArguments arguments) {

		System.out.println("foo:" + arguments.containsOption("foo"));
		System.out.println("bar:" + arguments.containsOption("bar"));
	}
}
