package com.example.YC2210JavaBackendInit.persist;
import java.util.Optional;

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
	
	public void SaveQAnswer(QAnswers qAnswers, long questionID) {
		
		Question q = qrepo.findById(questionID).get();
		qAnswers.setQuestionID(q);
		repo.save(qAnswers);
	}
	
	public Iterable<QAnswers> getQAnswer(long id) {
		Iterable<QAnswers> qanswers = repo.findAll();
		repo.findById(id);
		
		if(qanswers != null) {
			System.out.println("anwsers gevonden");
		return qanswers;
		}

		System.out.println("anwsers niet gevonden");
		return null;
	}
	
//	public interface CustomerRepository extends CrudRepository<Customer, Long> {
//
//		  List<Customer> findByLastName(String lastName);
//
//		  Customer findById(long id);
//		}
}