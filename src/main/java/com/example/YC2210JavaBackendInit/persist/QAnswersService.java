package com.example.YC2210JavaBackendInit.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.QAnswers;
import com.example.YC2210JavaBackendInit.Question;

@Service
public class QAnswersService {
	@Autowired
	QAnswersRepository repo;
	@Autowired
	QuestionRepository qrepo;

	public Iterable<QAnswers> getQAnswer(long id) {
		Iterable<QAnswers> qanswers = repo.findAll();
		repo.findById(id);
		return qanswers;
	}

	public void saveQAnswer(QAnswers qa, long id) {
		Question qtemp = qrepo.findById(id).get();
		qa.setQuestion(qtemp);
		repo.save(qa);
	}
}
