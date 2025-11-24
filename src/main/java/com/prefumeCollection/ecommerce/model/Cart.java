package com.prefumeCollection.ecommerce.model;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cartId")
    private int cartid;

    private int uid;
    private int id; // This likely refers to perfume/product id
    private String name;
    private String description;
    private String gender;
    private double price;
    private String imageurl;
    private int quantity;
    private String prodtype;
	public String getProdtype() {
		return prodtype;
	}
	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public Cart(int cartid, int uid, int id, String name, String description, String gender, double price,
			String imageurl, int quantity, String prodtype) {
		super();
		this.cartid = cartid;
		this.uid = uid;
		this.id = id;
		this.name = name;
		this.description = description;
		this.gender = gender;
		this.price = price;
		this.imageurl = imageurl;
		this.quantity = quantity;
		this.prodtype = prodtype;
	}

   public Cart() {}
@Override
public String toString() {
	return "Cart [cartid=" + cartid + ", uid=" + uid + ", id=" + id + ", name=" + name + ", description=" + description
			+ ", gender=" + gender + ", price=" + price + ", imageurl=" + imageurl + "]";
}
   
}