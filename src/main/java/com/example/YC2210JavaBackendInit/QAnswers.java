package com.example.YC2210JavaBackendInit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class QAnswers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String QAnswerText;
	@ManyToOne
	Question question;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQAnswerText() {
		return QAnswerText;
	}
	public void setQAnswerText(String qAnswerText) {
		QAnswerText = qAnswerText;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
}
