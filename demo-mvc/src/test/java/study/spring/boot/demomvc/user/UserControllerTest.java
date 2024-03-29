package study.spring.boot.demomvc.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void hello() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("hello"));
	}

	@Test
	public void createUser_JSON() throws Exception{
		String userJson = "{\"username\":\"younsoo\", \"password\":\"1234\"}";
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(userJson))
			.andExpect(status().isOk())
			.andExpect(jsonPath("username",
					is(equalTo("younsoo"))))
			.andExpect(jsonPath("password",
					is(equalTo("1234"))));
	}

	@Test
	public void createUser_XML() throws Exception{
		String userJson = "{\"username\":\"younsoo\", \"password\":\"1234\"}";
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_XML)
				.content(userJson))
				// 에러가 발생하면 자동으로 실행된다.
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(xpath("/User/username")
						.string("younsoo"))
				.andExpect(xpath("/User/password")
						.string("1234"));
	}
}
