package com.ecommerce.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Author Pragati Dabade */
@Entity
@Table (name = "user")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	private String usernames;
	
	private String realNames;
	
	private String passwords;
	
	private Integer genders;

	private Date birthday;
	
	private Integer userTypes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsernames() {
		return usernames;
	}

	public void setUsernames(String usernames) {
		this.usernames = usernames;
	}

	public String getRealNames() {
		return realNames;
	}

	public void setRealNames(String realNames) {
		this.realNames = realNames;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public Integer getGenders() {
		return genders;
	}

	public void setGenders(Integer genders) {
		this.genders = genders;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(Integer userTypes) {
		this.userTypes = userTypes;
	}

	
	


}
