package com.example.YC2210JavaBackendInit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.Bezorger;
import com.example.YC2210JavaBackendInit.persist.BezorgerService;

@RestController
public class BezorgerEndpoint {
	@Autowired
	BezorgerService service;
	
	
	@GetMapping("AlleBezorgers")
	public Iterable<Bezorger> getBezorger(){
		System.out.println("Hij doet het");
		service.bezorgen();
		return service.bezorgen();
		
		
	}
	
	

}
