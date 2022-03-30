package com.zensar.messageapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ZensarUser {

	@Id
	private int id;
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false, unique = false)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ZensarUser [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
