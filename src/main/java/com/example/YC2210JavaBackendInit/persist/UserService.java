package com.example.YC2210JavaBackendInit.persist;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.BCryptPasswordEncoder;
import com.example.YC2210JavaBackendInit.QAnswers;
import com.example.YC2210JavaBackendInit.Question;
import com.example.YC2210JavaBackendInit.User;

import net.bytebuddy.utility.RandomString;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public void SaveUser(User user) {
		repo.save(user);
	}

	public Optional<User> getUser(long id) {
		return repo.findById(id);
	}
	
	public Optional<User> login(String email) {
		Optional<User> user = repo.findByEmail(email);
		System.out.println(user);
		return user;
	}

	public void watchMovie(long movieID, long userID) {
		// TODO Auto-generated method stub
			//public void saveQAnswer(QAnswers qa, long id) {
			//long temp = repo.save(qa);
			//long qtemp = qrepo.findById(id).get();
			//qtemp.addAnswer(temp);
			//repo.save(qtemp);
		//}
	}
	
}
