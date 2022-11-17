package com.example.YC2210JavaBackendInit.persist;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.Question;

@Service
public class QuestionService {
	@Autowired
	QuestionRepository repo;

	@Autowired
	QAnswersRepository qa_repo;

	public void SaveQuestion(Question question) {
		repo.save(question);
	}

	public Question getQuestion(long id) {
		Optional<Question> question = repo.findById(id);

		if (question.isPresent()) {
			return question.get();
		}
		return null;
	}

	public Optional<Question> getQuestionsWithAnswers() {
		Optional<Question> qa = repo.findById(1l);
		System.out.println(qa);
		return qa;
	}

	public Iterable<Question> getQuestions() {
		return repo.findAll();
	}
}
