package com.example.YC2210JavaBackendInit;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String text;
	@Column(unique = true, nullable = false)
	private int orderNR;
	@OneToMany(mappedBy = "question")
	private List<QAnswers> qanswers;

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

	public List<QAnswers> getQanswers() {
		return qanswers;
	}

	public void setQanswers(List<QAnswers> qanswers) {
		this.qanswers = qanswers;
	}
}
