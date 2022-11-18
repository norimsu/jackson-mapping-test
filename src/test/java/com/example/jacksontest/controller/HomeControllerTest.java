package com.example.jacksontest.controller;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HomeControllerTest {

	@Autowired
	private MockMvc mockMvc; // mockMvc 생성

	@Test
	void test1() throws Exception {
		final String payload = "{"
				+ "\"name\":\"SPRING\""
				+ ",\"age\":10"
				+ ",\"isAdult\":true"
				+ "}";

		final ResultActions result = mockMvc.perform(post("/test").content(payload).contentType(APPLICATION_JSON)).andDo(print());
		result.andExpectAll(status().isOk(), jsonPath("$.name").value("SPRING"), jsonPath("$.age").value(10), jsonPath("$.isAdult").value(true));
	}

	@Test
	void test2() throws Exception {
		final String payload = "{"
//				+ "\"name\":\"SPRING\""
//				+ ",\"age\":10"
//				+ ",\"isAdult\":true"
				+ "}";

		final ResultActions result = mockMvc.perform(post("/test").content(payload).contentType(APPLICATION_JSON)).andDo(print());
		result.andExpectAll(status().isOk(), jsonPath("$.name").value("HONG-GIL-DONG"), jsonPath("$.age").value(0), jsonPath("$.isAdult").value(false));
	}

	@Test
	void test3() throws Exception {
		final String payload = "{"
				+ "\"name\":null"
				+ ",\"age\":null"
				+ ",\"isAdult\":null"
				+ "}";

		final ResultActions result = mockMvc.perform(post("/test").content(payload).contentType(APPLICATION_JSON)).andDo(print());
		result.andExpectAll(status().isOk(), jsonPath("$.name").value("HONG-GIL-DONG"), jsonPath("$.age").value(0), jsonPath("$.isAdult").value(false));
	}
}