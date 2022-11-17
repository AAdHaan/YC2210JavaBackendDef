package com.example.YC2210JavaBackendInit.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.User;
import com.example.YC2210JavaBackendInit.UserLoginDTO;
import com.example.YC2210JavaBackendInit.ExceptionHandling.EmailTooLongException;
import com.example.YC2210JavaBackendInit.ExceptionHandling.UserDoesntExistException;
import com.example.YC2210JavaBackendInit.ExceptionHandling.UsernameTooLongException;
import com.example.YC2210JavaBackendInit.persist.UserService;

import at.favre.lib.crypto.bcrypt.BCrypt;


@RestController

public class UserEndpoint {
	@Autowired
	UserService service;

	@GetMapping(value = "Login")
	public Optional<User> getUser(@RequestBody UserLoginDTO dto) throws UserDoesntExistException {
		User user = new User();
		System.out.println(dto.getEmail() + "dit is een email");
		if(service.login(dto.getEmail()).isPresent() ) {
			user = service.login(dto.getEmail()).get();
		}else {
			System.out.println("help geen user");
			throw new UserDoesntExistException("Email or Password doesn't exsist in the database.");
		}
		
		if( BCrypt.verifyer().verify(dto.getPassword().toCharArray(), user.getPassword().toCharArray()).verified) {		
			System.out.println("je bent ingelogd");
			return Optional.of(user);
		}else {
			throw new UserDoesntExistException("Email or Password doesn't exsist in the database.");
		}
	}
	
	
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
			user.setPassword(BCrypt.withDefaults().hashToString(12, (user.getPassword().toCharArray())));
			System.out.println(user.getPassword());
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
	
	@PostMapping("Watched/{userID}")
	public void watchMovie(@RequestBody long movieID, @PathVariable("userID") long userID){
	 service.watchMovie(movieID, userID);
	}
	
}
