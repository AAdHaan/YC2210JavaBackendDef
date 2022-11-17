package com.example.YC2210JavaBackendInit.Controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
	public GenreTripleDTO postGenreCalc(@RequestBody long[] qAnswers) {
		Stack<Integer> genreList = new Stack<Integer>();
		int[][] genreFrequencyList = { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 3, 0 }, { 4, 0 }, { 5, 0 }, { 6, 0 }, { 7, 0 },
				{ 8, 0 }, { 9, 0 } };
		GenreTripleDTO triple = new GenreTripleDTO();

		for (long Ans : qAnswers) {
			Iterable<Genre> qAnswGenre = service.getGenre(Ans);

			for (Genre genre : qAnswGenre) {
				genreList.add(genre.getGenreID());
			}
		}

		for (int genreID : genreList) {
			genreFrequencyList[genreID][1]++;
		}

		Arrays.sort(genreFrequencyList, Comparator.comparing(o -> o[1]));
		int[] tripleint = { genreFrequencyList[9][0], genreFrequencyList[8][0], genreFrequencyList[7][0] };
		triple.setGenres(tripleint);
		return triple;
	}
}
