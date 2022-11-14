package com.example.YC2210JavaBackendInit.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.YC2210JavaBackendInit.Genre;
import com.example.YC2210JavaBackendInit.QAnswers;

@Component
public interface GenreRepository extends CrudRepository<Genre, Long> {
	
	 //List<Genre> findByQAnswers(QAnswers Qanswer);
	 List<Genre> findAllByqAnswersIn(List<QAnswers> qAnswers);
	 //findAllByHashtagsInAndDateIsGreaterThanEqual
	
}
