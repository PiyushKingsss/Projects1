package com.mphasis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("Hi");
	}
	
	@GetMapping("/greet")
	
	public String message() {
		return "Welcome";
	}

}
