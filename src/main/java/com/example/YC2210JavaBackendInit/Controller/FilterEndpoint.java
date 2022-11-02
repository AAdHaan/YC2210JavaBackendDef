package com.example.YC2210JavaBackendInit.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.YC2210JavaBackendInit.persist.FilterService;
import com.example.YC2210JavaBackendInit.Filter;


@RestController
public class FilterEndpoint {
	@Autowired
	FilterService service;
	
	@GetMapping("Filter")
	public String getFilter() {
		return "wat een avontuur";
	}
	
	@PostMapping("Filter")
	public void postFilter(@RequestBody Filter filter) {
		service.SaveFilter(filter);
		System.out.println(filter.getFilterText());
	}
}
