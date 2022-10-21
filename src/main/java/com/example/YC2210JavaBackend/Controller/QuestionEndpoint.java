package com.example.YC2210JavaBackend.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackend.persist.QuestionService;
import com.example.YC2210JavaBackendInit.Question;


@RestController
public class QuestionEndpoint {
	@Autowired
	QuestionService service;
	
	@GetMapping("evenProberen")
	public void beginAvontuur() {
		System.out.println("we're going on an adventure");
	}
}
