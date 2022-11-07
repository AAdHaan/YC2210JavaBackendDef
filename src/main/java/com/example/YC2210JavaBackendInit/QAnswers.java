package com.example.YC2210JavaBackendInit;

import javax.persistence.*;

@Entity
public class QAnswers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String QAnswerText;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="questionId")
//	Question question;
	
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
//	public Question getQuestionText() {
//		return question;
//	}
//	public void setQuestionText(Question question) {
//		this.question = question;
//	}
}
