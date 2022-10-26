package com.example.YC2210JavaBackendInit.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.YC2210JavaBackendInit.QAnswers;

@Component
public interface QAnswersRepository extends CrudRepository<QAnswers, Long>{

		 // List<QAnswers> findQAnswersByQuestionID(String lastName);

	  QAnswers findQuestionById(long questionID);
}


