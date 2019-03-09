package com.extremity.jp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {
	
	@Id
	private int id;
	private String name;
	private String gender;
	private String Dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	
	
	
	

}
