package study.spring.boot.demobootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DemoBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBootAdminApplication.class, args);
	}

}
