package com.csc.autowired_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer1 {

	private int id;
	private String name;
	
	@Autowired
	Customer2 c2;
	@Autowired
	Customer3 c3;
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
	public void show()
	{
		System.out.println("CUSTOMER 1 ");
		c2.show();
		c3.show();
	}
}
