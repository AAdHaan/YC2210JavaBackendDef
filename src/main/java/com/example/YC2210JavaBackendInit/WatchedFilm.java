package com.example.YC2210JavaBackendInit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WatchedFilm {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
		
	@Column(nullable = false)
	long movieID;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMovieID() {
		return movieID;
	}

	public void setMovieID(long movieID) {
		this.movieID = movieID;
	}

}
