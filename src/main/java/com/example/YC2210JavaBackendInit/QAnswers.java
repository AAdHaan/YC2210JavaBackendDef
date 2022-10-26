package com.example.YC2210JavaBackendInit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QAnswers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String QAnswerText;
	int questionID;
	
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
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

}
