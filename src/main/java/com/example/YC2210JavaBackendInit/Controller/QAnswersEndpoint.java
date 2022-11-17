package com.example.YC2210JavaBackendInit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.QAnswers;
import com.example.YC2210JavaBackendInit.persist.QAnswersService;

@RestController
public class QAnswersEndpoint {
	@Autowired
	QAnswersService service;

	@PostMapping(value = "QAnswers/{questionId}")
	public void postQAnswer(@RequestBody QAnswers qa, @PathVariable("questionId") long id) {
		service.saveQAnswer(qa, id);
	}

	@GetMapping(value = "QAnswers/{id}")
	public Iterable<QAnswers> getQuestion(@PathVariable("id") long id) {
		Iterable<QAnswers> qanswers = service.getQAnswer(id);
		return qanswers;
	}
}