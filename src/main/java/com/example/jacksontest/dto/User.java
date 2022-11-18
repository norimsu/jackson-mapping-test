package com.example.jacksontest.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

	@JsonSetter(nulls = Nulls.SKIP)
	private String name = "HONG-GIL-DONG";

	@JsonSetter(nulls = Nulls.SKIP)
	private Long age = 0L;

	@JsonSetter(nulls = Nulls.SKIP)
	private Boolean isAdult = false;
}
