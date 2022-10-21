package com.example.YC2210JavaBackendInit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String questionText;
	String[] possibleAnswers;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}	
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String[] getPossibleAnswers() {
		return possibleAnswers;
	}
	public void setPossibleAnswers(String[] possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}
	

}
