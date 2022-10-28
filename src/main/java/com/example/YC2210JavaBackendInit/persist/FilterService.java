package com.example.YC2210JavaBackendInit.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YC2210JavaBackendInit.Filter;

@Service
public class FilterService {
	@Autowired
	FilterRepository repo;
	
	public void SaveFilter(Filter filter) {
		repo.save(filter);
	}	
}
