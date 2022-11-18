package com.example.jacksontest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

	private String name;

	private Long age;

	private Boolean isAdult;

	public Person(String name, Long age, Boolean isAdult) {
		this.name = name;
		this.age = age;
		this.isAdult = isAdult;
	}
}
