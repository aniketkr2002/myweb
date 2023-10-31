package com.springboot.iemconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.iemconnect.model.Signup;
import com.springboot.iemconnect.service.SignupService;

@RestController
@CrossOrigin
@RequestMapping(value="/")
public class SignupController {
	@Autowired
	private SignupService signservice;
	@PostMapping(value="/signup")
	public String createStudnet(@RequestBody Signup stud) {
		return signservice.createStudent(stud);
		}
	
}
