package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Display {
	@GetMapping(value = "/Prasad")
	public String See() {
		return "<body bgcolor='yellow' text='black'><h1>Hello Prasad</h1></body>";
	}
	@GetMapping(value="/Prasad1")
	public String See1()
	{
		return "<body bgcolor='yellow' text='black'><h1>Welcome to our new Project</h1></body>";
	}
}
