package com.csc.customer_service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
	@Id
    @Column(name="ID")
   private int id;
	@Column(name="Name")
   private String name;
	@Column(name="City")
   private String city;
	
	
	public Customer() {
		super();
	
	}

	public Customer(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
