package com.example.YC2210JavaBackendInit;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String questionText;
	int orderNR;
	@OneToMany
	List<QAnswers> answers = new ArrayList<QAnswers>();
	public List<QAnswers> getAnswers() {
		return answers;
	}
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

	public void addAnswer(QAnswers qa){
		this.answers.add(qa);
	}
}
