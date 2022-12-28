package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Userdao {
	public static int usercount = 5;
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "Prasad"));
		users.add(new User(2, "Shubham"));
		users.add(new User(3, "Priyanka"));
		users.add(new User(4, "Rohidas"));
		users.add(new User(5, "Ganesh"));
	}

	public List<User> findAll() {
		return users;
	}

}
