package com.csc.Placement_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {

	@Autowired
	private PlacementRepo repo;
	
	//Get all the records from the table
	public List<Placement> listAll()
	{
		return repo.findAll();	
	}
	
	//save the record
	public void save(Placement c)
	{
		repo.save(c);
	}
	
	//call specific record
	public Placement get(Integer cid)
	{
		return repo.findById(cid).get();
	}
	
	//Deleting specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	//Update specific record
	public void update(Placement cust)
	{
		repo.save(cust);
	}
	
}
