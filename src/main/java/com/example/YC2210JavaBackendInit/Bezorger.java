package com.example.YC2210JavaBackendInit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Bezorger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	String naam;
	String password;
	int leeftijd;
	Boolean beschikbaar;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public Boolean getBeschikbaar() {
		return beschikbaar;
	}
	public void setBeschikbaar(Boolean beschikbaar) {
		this.beschikbaar = beschikbaar;
	}

	
}
