package com.example.YC2210JavaBackendInit.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.User;
import com.example.YC2210JavaBackendInit.WatchedFilm;

@Service
public class WatchedFilmService {
	@Autowired
	WatchedFilmRepository repo;
	@Autowired
	UserRepository qrepo;

	public Iterable<WatchedFilm> getWatchedFilm(long id) {
		Iterable<WatchedFilm> WatchedFilm = repo.findAll();
		repo.findById(id);

		if (WatchedFilm != null) {
			System.out.println("answers gevonden");
			return WatchedFilm;
		}
		System.out.println("answers niet gevonden");
		return null;
	}

	public void saveWatchedFilm(WatchedFilm watchedFilm, long userID) {
		WatchedFilm temp = repo.save(watchedFilm);
		User qtemp = qrepo.findById(userID).get();
		qtemp.addWatchedFilm(temp);
		qrepo.save(qtemp);
	}
}
