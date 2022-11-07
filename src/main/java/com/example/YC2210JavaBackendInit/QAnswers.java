package com.example.YC2210JavaBackendInit;

import javax.persistence.*;

@Entity
public class QAnswers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String text;
	
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
}
