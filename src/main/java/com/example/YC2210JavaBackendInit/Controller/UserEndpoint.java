package com.example.YC2210JavaBackendInit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.persist.UserService;
import com.example.YC2210JavaBackendInit.Filter;
import com.example.YC2210JavaBackendInit.User;


@RestController

public class UserEndpoint {
	@Autowired
	UserService service;
	
	@GetMapping("User")
	public String beginAvontuur() {
		System.out.println("we're going on an adventure");
		return "wat een avontuur";
	}
	
	@PostMapping("User")
	public void postUser(@RequestBody User user) {
		service.SaveUser(user);
		System.out.println(user.getUsername() +" "+ user.getEmail() +" "+ user.getHashedPassword());
	}
	
}
