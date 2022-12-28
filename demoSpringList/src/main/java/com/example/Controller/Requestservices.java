package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Requestservices {
	@Autowired
	private Userdao service;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public List<User> retriveAllUsers() {
		return service.findAll();

	}

}
