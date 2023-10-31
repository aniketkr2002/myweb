package com.springboot.iemconnect.dao;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.springboot.iemconnect.model.Login;
@Repository
public interface  Logindao extends CrudRepository<Login,Long> {
	
}
