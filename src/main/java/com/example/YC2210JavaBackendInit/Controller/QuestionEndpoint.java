package com.example.YC2210JavaBackendInit.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.persist.QuestionService;
import com.example.YC2210JavaBackendInit.Filter;
import com.example.YC2210JavaBackendInit.Question;
import com.example.YC2210JavaBackendInit.User;


@RestController
public class QuestionEndpoint {
	@Autowired
	QuestionService service;

	@PostMapping("Question")
	public void postQuestion(@RequestBody Question question) {
		service.SaveQuestion(question);
		System.out.println(question.getQuestionText() +" "+ question.getOrderNR() +" "+ question.getId());
	}
		
	@GetMapping(value = "Question/{id}")
	public String getQuestion(@PathVariable("id") long id) {
		Question question = service.getQuestion(id);
		System.out.println(question.getQuestionText() +" "+ question.getOrderNR() +" "+ question.getId());
		return question.getQuestionText();
	}
	 
}
