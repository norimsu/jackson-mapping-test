package com.example.jacksontest.controller;

import com.example.jacksontest.dto.Person;
import com.example.jacksontest.dto.User;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

	@PostMapping("/test")
	public Person test(@RequestBody User user) {
		log.warn("user: {}", user);
		final Person person = new Person(user.getName(), user.getAge(), user.getIsAdult());
		log.warn("person: {}", person);
		return person;
	}
}
