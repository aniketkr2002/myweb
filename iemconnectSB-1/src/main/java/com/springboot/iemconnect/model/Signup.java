package com.springboot.iemconnect.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sign_details")
public class Signup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String email;
	private String name;
	private long enrollment;
	private String password;
	private String year;
	private String  branch;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public long getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(long enrollment) {
		this.enrollment = enrollment;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Signup(long id, String email, String name, long enrollment, String password, String year, String branch) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.enrollment = enrollment;
		this.password = password;
		this.year = year;
		this.branch = branch;
	}
	public Signup() {}
	
}
