package com.springboot.iemconnect.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.iemconnect.model.Signup;
@Repository
public interface Signdao extends CrudRepository<Signup,Long>{
	
	Long findByEnrollment(Long Enroll);
}

