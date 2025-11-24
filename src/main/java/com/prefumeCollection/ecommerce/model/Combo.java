package com.prefumeCollection.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Combo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    private String description;
    private String gender; 
    private String name;
    private Double price;
    private String imageurl;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public Combo(int cid, String description, String gender, String name, Double price, String imageurl) {
		super();
		this.cid = cid;
		this.description = description;
		this.gender = gender;
		this.name = name;
		this.price = price;
		this.imageurl = imageurl;
	}
	public Combo() {
		
	}

}
