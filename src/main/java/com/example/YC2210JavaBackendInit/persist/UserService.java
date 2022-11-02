package com.example.YC2210JavaBackendInit.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.BCryptPasswordEncoder;
import com.example.YC2210JavaBackendInit.User;

import net.bytebuddy.utility.RandomString;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
//	@Bean
//	public BCryptPasswordEncoder bCryptPasswordEncoder() {
//	    return new BCryptPasswordEncoder();
//	}
//    @Autowired
//    private JavaMailSender mailSender;
	


	public void SaveUser(User user) {
		

//		String randomCode = RandomString.make(64);
//	    user.setVerificationCode(randomCode);
//	    user.setEnabled(false);
//		String hashedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
//		user.setPassword(hashedPassword);
		repo.save(user);
	//	sendVerificationEmail(user, siteURL);
	}

//    private void sendVerificationEmail(User user, String siteURL) {
//        
//    }
	
}
