package com.example.YC2210JavaBackendInit.persist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.Genre;
import com.example.YC2210JavaBackendInit.QAnswers;

@Service
public class GenreService {
	@Autowired
	GenreRepository repo;
	@Autowired
	QAnswersRepository crepo;

	public Iterable<Genre> getGenre(long id) {
		QAnswers Qanswers = crepo.findById(id).get();
		List<QAnswers> QanswerList = new ArrayList<QAnswers>();
		QanswerList.add(Qanswers);
		List<Genre> genres = repo.findAllByqAnswersIn(QanswerList);
		return genres;
	}

	public void saveGenre(Genre ge, long id) {
		QAnswers qtemp = crepo.findById(id).get();
		if (ge.getqAnswers() == null) {
			ge.setqAnswers(new ArrayList<>());
		}
		ge.getqAnswers().add(qtemp);
		repo.save(ge);
	}
}
