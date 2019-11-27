package study.spring.boot.demoexcept;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping("/hello")
	public String hello() {
		throw new SampleException();
	}
}
