package study.spring.boot.demohateoas;

import org.springframework.core.io.Resource;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public EntityModel<Hello> hello() {
		Hello hello = new Hello();
		hello.setPrefix("Hey ,");
		hello.setName("younsoo");

		// _links를 생성하는 코드
		// Resource changed EntityModel (19/03)
		EntityModel<Hello> helloResource = new EntityModel<>(hello);
		helloResource.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());

		return helloResource;
	}
}
