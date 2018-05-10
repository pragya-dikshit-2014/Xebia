package com.products.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	private String store;
	@Id
	private long bar_code;
	private int price;
	private String notes;
	private AdminProductDeatils value;
	
	public AdminProductDeatils getValue() {
		return value;
	}


	public void setValue(AdminProductDeatils value) {
		this.value = value;
	}
	
	public Product() {
		super();
	}
	
	
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public long getBar_code() {
		return bar_code;
	}
	public void setBar_code(long bar_code) {
		this.bar_code = bar_code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	
	

}
