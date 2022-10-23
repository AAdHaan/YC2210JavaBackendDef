package com.example.YC2210JavaBackendInit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filter {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String[] possibleFilters;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String[] getPossibleFilters() {
		return possibleFilters;
	}

	public void setPossibleFilters(String[] possibleFilters) {
		this.possibleFilters = possibleFilters;
	}	

}
