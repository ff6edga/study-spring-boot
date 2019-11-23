package study.spring.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Demo2Runner implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(Demo2Runner.class);

	@Autowired
	String hello;

	@Autowired
	YounsooProperties props;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("=====================");
		logger.debug(props.getName());
		logger.debug(props.getFullName());
		logger.debug("=====================");
	}
}
