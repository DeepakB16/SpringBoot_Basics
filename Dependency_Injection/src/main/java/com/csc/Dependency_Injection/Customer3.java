package com.csc.Dependency_Injection;
import org.springframework.stereotype.Component;

@Component
public class Customer3 {
	private int id;
	private String name;
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
		System.out.println("CUSTOMER 3 ");
	}
}
