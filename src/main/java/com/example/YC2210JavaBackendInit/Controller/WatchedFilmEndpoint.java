package com.example.YC2210JavaBackendInit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.WatchedFilm;
import com.example.YC2210JavaBackendInit.persist.WatchedFilmService;

@RestController
public class WatchedFilmEndpoint {
	@Autowired
	WatchedFilmService service;

	@PostMapping(value = "WatchedFilms/{userID}")
	public void postWatchedFilm(@RequestBody WatchedFilm wf, @PathVariable("userID") long id) {
		service.saveWatchedFilm(wf, id);
	}

	@GetMapping(value = "WatchedFilms/{userID}")
	public Iterable<WatchedFilm> getUser(@PathVariable("userID") long id) {
		Iterable<WatchedFilm> WatchedFilms = service.getWatchedFilm(id);
		return WatchedFilms;
	}
}
