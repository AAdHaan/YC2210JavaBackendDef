package com.example.YC2210JavaBackendInit.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.Question;
import com.example.YC2210JavaBackendInit.persist.QuestionService;


@RestController
public class QuestionEndpoint {
	@Autowired
	QuestionService service;

	@PostMapping("Question")
	public void postQuestion(@RequestBody Question question) {
		service.SaveQuestion(question);
	}
		
	@GetMapping(value = "Question/{id}")
	public Question getQuestion(@PathVariable("id") long id) {
		Question question = service.getQuestion(id);
		System.out.println(question.getText() +" "+ question.getOrderNR() +" "+ question.getId());
		return question;
	}

	@GetMapping(value = "Question")
	public Iterable<Question> getQuestions() {
		Iterable<Question> questions = service.getQuestions();
		return questions;
	}
}
