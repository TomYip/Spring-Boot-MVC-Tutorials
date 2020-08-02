package com.tomyip.springbootwebapp;

import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringBootWebAppApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getHelloWithDefaultParam() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/hello")
				.accept(MediaType.ALL.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello, World!")));

	}

	@Test
	public void getHelloWithProvidedParam() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/hello?name=Tom")
				.accept(MediaType.ALL.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello, Tom!")));

	}

	@Test
	void contextLoads() {
	}

}
