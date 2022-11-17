package com.example.YC2210JavaBackendInit.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.YC2210JavaBackendInit.WatchedFilm;

@Component
public interface WatchedFilmRepository extends CrudRepository<WatchedFilm, Long> {

	WatchedFilm findUserById(long questionID);

}
