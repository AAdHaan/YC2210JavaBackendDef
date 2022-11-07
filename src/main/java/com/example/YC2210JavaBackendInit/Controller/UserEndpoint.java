package com.example.YC2210JavaBackendInit.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.persist.UserService;
import com.example.YC2210JavaBackendInit.Filter;
import com.example.YC2210JavaBackendInit.Question;
import com.example.YC2210JavaBackendInit.User;
import com.example.YC2210JavaBackendInit.ExceptionHandling.EmailTooLongException;
import com.example.YC2210JavaBackendInit.ExceptionHandling.UserDoesntExistException;
import com.example.YC2210JavaBackendInit.ExceptionHandling.UsernameTooLongException;


@RestController

public class UserEndpoint {
	@Autowired
	UserService service;

	@GetMapping(value = "User/{id}")
	public Optional<User> getUser(@PathVariable("id")long id) throws UserDoesntExistException {
		System.out.println("we're going on an adventure");
		if(service.getUser(id).isPresent()) {
			return service.getUser(id);
		}else {
			System.out.println("help geen user");
			throw new UserDoesntExistException("User doesn't exsist in the database.");
		}
		
	}

	@PostMapping("User")
	public void postUser(@RequestBody User user) throws EmailTooLongException, UsernameTooLongException {
		try {
			service.SaveUser(user);
		} catch(Exception err) {
			if(user.getEmail().length() > 50) {
				throw new EmailTooLongException("Email is too long.", err);
			}
			if(user.getUsername().length() > 20) {
				throw new UsernameTooLongException("Username is too long.", err);
			}
		}
		System.out.println(user.getUsername() +" "+ user.getEmail() +" "+ user.getPassword());
	}
}
