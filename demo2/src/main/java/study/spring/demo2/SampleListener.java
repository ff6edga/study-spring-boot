package study.spring.demo2;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {
//public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
	@Override
	public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
		System.out.println("===================");
		System.out.println("Application is started");
		System.out.println("===================");
	}
}
