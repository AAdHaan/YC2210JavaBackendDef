package com.example.YC2210JavaBackendInit.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.persist.QAnswersService;
import com.example.YC2210JavaBackendInit.persist.QuestionService;
import com.example.YC2210JavaBackendInit.Filter;
import com.example.YC2210JavaBackendInit.QAnswers;
import com.example.YC2210JavaBackendInit.Question;
import com.example.YC2210JavaBackendInit.User;


@RestController
public class QAnswersEnpoint {
	@Autowired
	QAnswersService service;
	
	@PostMapping("QAnswers/{QuestionID}")
	public void postQuestion(@RequestBody QAnswers qanswer, @PathVariable("QuestionID") long questionID) {
		service.SaveQAnswer(qanswer, questionID);
		System.out.println(qanswer.getId() +" "+ qanswer.getQAnswerText() +" "+ qanswer.getQuestionID());
	}
		
	@GetMapping(value = "QAnswers/{id}")
	public Iterable<QAnswers> getQuestion(@PathVariable("id") long id) {
		Iterable<QAnswers> qanswers = service.getQAnswer(id);
		//System.out.println(qanswer.getId() +" "+ qanswer.getQAnswerText() +" "+ qanswer.getQuestionID());		
		return qanswers;
	}
}