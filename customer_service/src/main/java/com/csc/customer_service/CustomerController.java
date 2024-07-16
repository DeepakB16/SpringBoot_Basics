package com.csc.customer_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cust;
	
	@GetMapping("/customerservice")          //display records in op
	public List<Customer> list()
	{
		return cust.listAll();
	}
	
	@PostMapping("/customerservice")         //gets record from user
	public void add(@RequestBody Customer c1)
	{
		cust.save(c1);
	}
 
	@GetMapping("/customerservice/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id)
	{
		try 
		{
			Customer c=cust.get(id);
			return new ResponseEntity<Customer>(c,HttpStatus.OK);
		} 
		catch (NoResultException e)
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/customerservice/{id}")
	public void delete(@PathVariable Integer id)
	{
	   cust.delete(id);
	}
	
	@PutMapping("customerservice/{id}")
	public ResponseEntity<Customer> update(@PathVariable Integer id,@RequestBody Customer cu)
	{
		try 
		{
			Customer exc=cust.get(id);
			exc.setName(cu.getName());
			exc.setCity(cu.getCity());
			cust.update(exc);
			return new ResponseEntity<Customer>(exc,HttpStatus.OK);
		} 
		catch (NoResultException e)
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
}
