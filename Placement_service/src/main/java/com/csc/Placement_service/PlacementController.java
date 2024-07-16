package com.csc.Placement_service;

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
public class PlacementController {

	@Autowired
	private PlacementService place;
	
	@GetMapping("/placementservice")          //display records in op
	public List<Placement> list()
	{
		return place.listAll();
	}
	
	@PostMapping("/placementservice")         //gets record from user
	public void add(@RequestBody Placement c1)
	{
		place.save(c1);
	}
 
	@GetMapping("/placementservice/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id)
	{
		try 
		{
			Placement c=place.get(id);
			return new ResponseEntity<Placement>(c,HttpStatus.OK);
		} 
		catch (NoResultException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/placementservice/{id}")
	public void delete(@PathVariable Integer id)
	{
	   place.delete(id);
	}
	
	@PutMapping("placementservice/{id}")
	public ResponseEntity<Placement> update(@PathVariable Integer id,@RequestBody Placement cu)
	{
		try 
		{
			Placement exc=place.get(id);
			exc.setCname(cu.getCname());
			exc.setVacency(cu.getVacency());
			place.update(exc);
			return new ResponseEntity<Placement>(exc,HttpStatus.OK);
		} 
		catch (NoResultException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
}
