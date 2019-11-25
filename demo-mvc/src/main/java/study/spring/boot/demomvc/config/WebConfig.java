package study.spring.boot.demomvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/m/**")
				.addResourceLocations("classpath:/m/") // 반드시 슬래시로 끝내야 맵핑이 된다.
				.setCachePeriod(20); //초 단위, 기본 리소스와 다르게 사용자가 캐싱 전략을 설정해야 한다.
	}
}
