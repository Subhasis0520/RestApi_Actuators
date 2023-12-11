package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDeno {

	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
}
