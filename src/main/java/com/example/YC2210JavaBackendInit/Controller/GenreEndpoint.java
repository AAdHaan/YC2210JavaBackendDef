package com.example.YC2210JavaBackendInit.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.Genre;
import com.example.YC2210JavaBackendInit.persist.GenreService;

@RestController
public class GenreEndpoint {
	@Autowired
	GenreService service;
	
	@PostMapping(value = "Genre/{qAnswerID}")
	public void postGenre(@RequestBody Genre ge, @PathVariable ("qAnswerID") long id){
		service.saveGenre(ge, id);
	}
	
	@GetMapping(value = "Genre/{id}")
	public Iterable<Genre> getGenre(@PathVariable("id") long id) {
		Iterable<Genre> genre = service.getGenre(id);
		return genre;
	}
}
