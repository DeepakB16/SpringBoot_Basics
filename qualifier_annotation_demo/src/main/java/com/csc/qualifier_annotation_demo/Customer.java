package com.csc.qualifier_annotation_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Autowired
	@Qualifier("idli")
	Ordering o;
	
	public void order()
	{
		o.order();
	}
}
