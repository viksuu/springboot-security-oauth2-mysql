package com.viksuu.tech.security.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/admin")
public class UserResource {
	
	@GetMapping
	public String getEntry() {
		return "Welcome to viksuu tech";
	}
	
	
}
