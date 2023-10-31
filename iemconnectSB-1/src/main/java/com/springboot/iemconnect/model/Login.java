package com.springboot.iemconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private Long Enrollment;
	
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEnrollment() {
		return Enrollment;
	}

	public void setEnrollment(Long enrollment) {
		Enrollment = enrollment;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login(long id, String name, Long enrollment, String password) {
		super();
		this.id = id;
		this.name = name;
		Enrollment = enrollment;
		this.password = password;
	}

	public Login() {}
	
}
