package com.example.YC2210JavaBackendInit;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	int genreID;
	@JsonIgnore
	
	@ManyToMany()
	private List<QAnswers> qAnswers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getGenreID() {
		return genreID;
	}

	public void setGenreID(int genreID) {
		this.genreID = genreID;
	}

	public List<QAnswers> getqAnswers() {
		return qAnswers;
	}

	public void setqAnswers(List<QAnswers> qAnswers) {
		this.qAnswers = qAnswers;
	}
}
