package com.example.YC2210JavaBackendInit.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.User;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public void SaveUser(User user) {
		repo.save(user);
	}
	
}
