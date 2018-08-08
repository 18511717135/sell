package com.example.sell;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	@RequestMapping("/hello")
	public String test() {
		return "hello world!";
	}

}
