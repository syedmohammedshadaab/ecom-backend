package com.prefumeCollection.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	private String name;
	private String address;
	private String email;
	private Long mobile;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile =  mobile;
	}
	public User(int uid, String name, String address, String email, Long mobile, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	
	public User() {
		
	}
	public User orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
