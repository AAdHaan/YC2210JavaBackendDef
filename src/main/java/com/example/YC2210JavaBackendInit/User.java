package com.example.YC2210JavaBackendInit;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;

	@Column(length = 20, nullable = false)
	String username;
	@Column(length = 100, nullable = false)
	String password;
	@Column(length = 50, unique = true, nullable = false)
	String email;
	@OneToMany
	List<WatchedFilm> watchedFilm = new ArrayList<WatchedFilm>();

	public List<WatchedFilm> getQanswers() {
		return watchedFilm;
	}

	public void setQanswers(List<WatchedFilm> WatchedFilm) {
		this.watchedFilm = WatchedFilm;
	}

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

	public void addWatchedFilm(WatchedFilm temp) {
		watchedFilm.add(temp);
	}
}
