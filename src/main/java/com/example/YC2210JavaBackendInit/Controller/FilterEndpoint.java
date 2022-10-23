package com.example.YC2210JavaBackendInit.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.persist.FilterService;
import com.example.YC2210JavaBackendInit.Filter;


@RestController
public class FilterEndpoint {
	@Autowired
	FilterService service;
	
	@GetMapping("hoi2")
	public String testTest() {
		System.out.println("we're going on an adventure22");
		return "wat een avontuur22";
	}
}
