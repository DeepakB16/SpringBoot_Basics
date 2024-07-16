package com.csc.Placement_service;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Placement {
	
	@Id
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String cname ;
	@Column(name="Vacency")
	private int vacency;
	
	public int getVacency() {
		return vacency;
	}

	public void setVacency(int vacency) {
		this.vacency = vacency;
	}

	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Placement(int id, String cname, int vacency) {
		super();
		this.id = id;
		this.cname = cname;
		this.vacency = vacency;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
