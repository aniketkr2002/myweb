package com.springboot.iemconnect.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.iemconnect.dao.Logindao;
import com.springboot.iemconnect.dao.Signdao;
import com.springboot.iemconnect.model.Login;



@Service
public class LoginService {
	@Autowired
	private Logindao logdao ;
	@Autowired
	private Signdao signdao;
	public String  saveLoginDetails(Login stud) {
			if(stud.getEnrollment()==signdao.findByEnrollment(stud.getEnrollment())) {
				 logdao.save(stud);
			}
			else {
				return "you have not student or registered";
			}
			return "";
		
	}
}
