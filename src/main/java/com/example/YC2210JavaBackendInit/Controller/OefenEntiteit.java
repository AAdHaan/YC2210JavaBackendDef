package com.example.YC2210JavaBackendInit.Controller;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OefenEntiteit {
	@Id
	long id;
	
	String naam;
	int leeftijd;
	LocalDate geboortedatum;
	String gender;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public LocalDate getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(LocalDate geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	
	
	
}
