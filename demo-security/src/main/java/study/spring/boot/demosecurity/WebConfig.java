package study.spring.boot.demosecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	//HomeController와 같은 코드
	// 특정 파라메터 없이 뷰로 보내기만 해도 된다면 해당코드 쓰자.
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/hello2").setViewName("hello2");
	}
}
