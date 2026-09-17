package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Ecommerce {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String pname;
	double price;
	int quantity;
	String description; /* Description-not desc because desc is a keyword in mysql so error */
	
	public Ecommerce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ecommerce(String pname, double price, int quantity, String description) {
		super();
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
