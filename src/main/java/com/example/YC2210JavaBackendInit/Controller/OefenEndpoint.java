package com.example.YC2210JavaBackendInit.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OefenEndpoint {
	
	@GetMapping("oefeningOmed")
	public String beginAvontuur() {
		System.out.println("we're going on an adventure");
		return "wat een avontuur";
	}
	
	@GetMapping("testGetMapping")
	public OefenEntiteit gender() {
		System.out.println("I'm a male");
		return new OefenEntiteit();
	}

}
