package com.springboot.iemconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.iemconnect.dao.Signdao;
import com.springboot.iemconnect.model.Signup;

@Service
public class SignupService {

		
		@Autowired
		private Signdao signdao;
		
		
		public String createStudent(Signup stud) {
			if(stud.getEnrollment()!=signdao.findByEnrollment(stud.getEnrollment()))
			    signdao.save(stud);
			else
				return  "already registered";
			
			return "";
		}
}
