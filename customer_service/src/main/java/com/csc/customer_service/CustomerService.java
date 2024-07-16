package com.csc.customer_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService 
{
	@Autowired
	private CustomerRepository repo;
	
	//Get all the records from the table
	public List<Customer> listAll()
	{
		return repo.findAll();	
	}
	
	//save the record
	public void save(Customer c)
	{
		repo.save(c);
	}
	
	//call specific record
	public Customer get(Integer cid)
	{
		return repo.findById(cid).get();
	}
	
	//Deleting specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	//Update specific record
	public void update(Customer cust)
	{
		repo.save(cust);
	}
	
}
