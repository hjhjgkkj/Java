package com.example.demo;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@PostMapping("/user")
	public String hello(@RequestBody User user) {
		System.out.println("name:" + user.getName());
		System.out.println("age:" + user.getAge());
		return "Hello, Spring Boot!";
	}
}
