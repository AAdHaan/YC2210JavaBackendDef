package com.example.YC2210JavaBackendInit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
		System.out.println("postWerkt" + " " + bezorger.getNaam());
		service.createBezorger(bezorger);
	}
	
	@GetMapping("/Bezorger/{bid}")
	public Bezorger findBezorger(@PathVariable("bid") Long bezorgerid) {
		return service.vindBezorger(bezorgerid);
	}
	
	@GetMapping("/Gegevens/{Email}/{Password}")	
	public String bezorgerGegevens(@PathVariable("Email") String bezorgerEmail, @PathVariable("Password") String bezorgerWachtwoord){
	System.out.println(bezorgerEmail);
		return "abc";
	}

	@DeleteMapping("verwijderBezorger/{bid}")
	public void verwijderBezorger(@PathVariable("bid") long bezorgerid) {
		service.verwijderBezorger(bezorgerid);
	}
	
	
	
//	 // A Java Program to generate OTP (One Time Password)
//	static class GFG{
//	 
//	// A Function to generate a unique OTP everytime
//	static String generateOTP(int len)
//	{
//	    // All possible characters of my OTP
//	    String str = "abcdefghijklmnopqrstuvwxyzABCD"
//	            +"EFGHIJKLMNOPQRSTUVWXYZ0123456789";
//	    int n = str.length();
//	 
//	    // String to hold my OTP
//	    String OTP="";
//	 
//	    for (int i = 1; i <= len; i++)
//	        OTP += (str.charAt((int) ((Math.random()*10) % n)));
//	 
//	    return(OTP);
//	}
//	 
//	// Driver code
//	public static void main(String[] args)
//	{
//	 
//	    // Declare the length of OTP
//	    int len = 6;
//	    System.out.printf("Your OTP is - %s", generateOTP(len));
//	}
//	}
//	

}
