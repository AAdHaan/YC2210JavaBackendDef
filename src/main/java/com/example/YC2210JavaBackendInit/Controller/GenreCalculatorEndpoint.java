package com.example.YC2210JavaBackendInit.Controller;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.Genre;
import com.example.YC2210JavaBackendInit.GenreTripleDTO;
import com.example.YC2210JavaBackendInit.persist.GenreService;
@RestController
public class GenreCalculatorEndpoint {
	@Autowired
	GenreService service;

	@PostMapping(value = "GenreCalc")
	public GenreTripleDTO postGenreCalc(@RequestBody long[] qAnswers){
		Stack<Integer> genreList = new Stack<Integer>();
		int[] genreFrequencyList = new int[10];
		GenreTripleDTO triple = new GenreTripleDTO();
		
		for(long Ans : qAnswers){
			Iterable<Genre> qAnswGenre = service.getGenre(Ans);
			for(Genre genre :qAnswGenre) {
				genreList.add(genre.getGenreID());
			}	
		}
		
		for(int genreID : genreList) {
			genreFrequencyList[genreID]++;
		}
		
		Arrays.sort(genreFrequencyList);
		triple.setGenres(Arrays.copyOfRange(genreFrequencyList, 7, 9));	
		return triple;
	}
}
