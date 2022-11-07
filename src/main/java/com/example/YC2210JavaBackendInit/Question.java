package com.example.YC2210JavaBackendInit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	@Column(nullable = false)
	String questionText;
	@Column(unique = true, nullable = false)
	int orderNR;
	
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
	public int getOrderNR() {
		return orderNR;
	}
	public void setOrderNR(int orderNR) {
		this.orderNR = orderNR;
	}
}
