package com.example.YC2210JavaBackendInit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.Bezorger;
import com.example.YC2210JavaBackendInit.persist.BezorgerService;

@RestController
public class BezorgerEndpoint {
	@Autowired
	BezorgerService service;
	
	
	@GetMapping("/AlleBezorgers")
	public Iterable<Bezorger> getBezorger(){
		System.out.println("Hij doet het");
		service.bezorgen();
		return service.bezorgen();
		
	}
	
	@PostMapping("/Bezorger")
	public void postBezorger(@RequestBody Bezorger bezorger) {
		System.out.println("postWerkt" + bezorger.getNaam());
		service.createBezorger(bezorger);
	}
	
	@GetMapping("/Bezorger/{bid}")
	public Bezorger findBezorger(@PathVariable("bid") Long bezorgerid) {
		return service.vindBezorger(bezorgerid);
	}
	
	
	
	

}
