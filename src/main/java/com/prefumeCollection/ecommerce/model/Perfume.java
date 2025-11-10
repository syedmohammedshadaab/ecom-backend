package com.prefumeCollection.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity	
public class Perfume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String description;
	private String gender;
	private Double price;
	private String imageurl;
	private boolean latestlaunch;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageurl;
	}
	public void setImageUrl(String imageurl) {
		this.imageurl = imageurl;
	}
	public boolean getLatestLaunch() {
		return latestlaunch;
		
	}
	public void setLatestLaunch(boolean latestlaunch) {
		this.latestlaunch = latestlaunch;
	}
	public Perfume(int id, String name, String description, String gender, Double price, String imageurl,
			boolean latestlaunch) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.gender = gender;
		this.price = price;
		this.imageurl = imageurl;
		this.latestlaunch = latestlaunch;
	}
	
	public Perfume() {
		
	}
}
