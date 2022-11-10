package com.example.YC2210JavaBackendInit.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.YC2210JavaBackendInit.Genre;

@Component
public interface GenreRepository extends CrudRepository<Genre, Long> {
	
}
