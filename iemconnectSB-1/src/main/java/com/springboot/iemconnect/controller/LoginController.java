package com.springboot.iemconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.iemconnect.model.Login;
import com.springboot.iemconnect.service.LoginService;

@RestController
@CrossOrigin
@RequestMapping(value="/")
public class LoginController {

	@Autowired
	private LoginService  logservice;
	@PostMapping(value="/login")
	public String saveLoginDetails(@RequestBody Login stud) {
		return logservice.saveLoginDetails(stud);
	}
}
