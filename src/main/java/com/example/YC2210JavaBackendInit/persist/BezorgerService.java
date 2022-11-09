package com.example.YC2210JavaBackendInit.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.YC2210JavaBackendInit.Bezorger;

@Service
public class BezorgerService {
	@Autowired
	BezorgerRepository repo;
	
	@GetMapping("BezorgerService")
	public Iterable<Bezorger> bezorgen() {
		System.out.println("Bestelling aangekomen");
		return repo.findAll();
	}

	public void createBezorger(Bezorger bezorger) {
		repo.save(bezorger);
		
	}

}
