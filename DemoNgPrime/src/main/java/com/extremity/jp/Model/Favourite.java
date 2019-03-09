package com.extremity.jp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Favourite {
	
	
	@Id
	private String favkey;
	private String favValue;
	public String getFavkey() {
		return favkey;
	}
	public void setFavkey(String favkey) {
		this.favkey = favkey;
	}
	public String getFavValue() {
		return favValue;
	}
	public void setFavValue(String favValue) {
		this.favValue = favValue;
	}
	
	

}
