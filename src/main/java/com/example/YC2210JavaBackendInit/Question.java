package com.example.YC2210JavaBackendInit;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	@Column(nullable = false)
	String text;
	@Column(unique = true, nullable = false)
	int orderNR;

	public List<QAnswers> getQanswers() {
		return qanswers;
	}

	public void setQanswers(List<QAnswers> qanswers) {
		this.qanswers = qanswers;
	}

	@OneToMany
	List<QAnswers> qanswers = new ArrayList<QAnswers>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getOrderNR() {
		return orderNR;
	}
	public void setOrderNR(int orderNR) {
		this.orderNR = orderNR;
	}

	public void addAnswer(QAnswers temp) {
		qanswers.add(temp);
	}
}
