package study.spring.boot.demothymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "younsoo");
		return "hello";
	}
}
