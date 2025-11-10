package com.prefumeCollection.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderprfm")
public class OrderPrfm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	
	private int id;
	private int uid;
	public int getoId() {
		return oid;
	}
	public void setoId(int oid) {
		this.oid = oid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getuid() {
		return uid;
	}
	public void setuid(int uid) {
		this.uid = uid;
	}
	public OrderPrfm(int oid, int id, int uid) {
		super();
		this.oid = oid;
		this.id = id;
		this.uid = uid;
	}
	public OrderPrfm() {
		
	}
}
