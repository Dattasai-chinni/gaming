package com.example.gitProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/api/hello")
	public String hello() {
		return "hello git";//this is welcome message
	}
}
