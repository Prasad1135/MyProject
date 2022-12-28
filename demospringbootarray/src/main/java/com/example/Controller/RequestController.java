package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
@PostMapping("/user/{name}")
public static String receiveUser(@PathVariable String name)
//public static String receiveUser(@RequestBody User user)
{
	//System.out.println(user.getId());
	//System.out.println(user.getName());
	System.out.println("Id of User is:"+name);
	return  "User received :";
}
}
