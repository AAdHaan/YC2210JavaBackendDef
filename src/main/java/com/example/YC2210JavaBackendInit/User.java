package com.example.YC2210JavaBackendInit;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	@Column(length = 20, nullable = false)
	String username;
	@Column(length = 50, nullable = false)
	String password;
	@Column(length = 50, unique = true, nullable = false)
	String email;
	
//	@Column(length = 64, nullable = false)
//	private String verificationCode;
//	private boolean enabled;
	
//	public String getVerificationCode() {
//		return verificationCode;
//	}
//	public void setVerificationCode(String verificationCode) {
//		this.verificationCode = verificationCode;
//	}
//	public boolean isEnabled() {
//		return enabled;
//	}
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
