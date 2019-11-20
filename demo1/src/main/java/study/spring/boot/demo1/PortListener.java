package study.spring.boot.demo1;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {
	@Override
	public void onApplicationEvent(ServletWebServerInitializedEvent event) {
		ServletWebServerApplicationContext applicationContext = event.getApplicationContext();
		System.out.println(">> Port of PortListener :" + applicationContext.getWebServer().getPort());
	}
}
