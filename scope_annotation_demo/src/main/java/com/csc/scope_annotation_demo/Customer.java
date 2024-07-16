package com.csc.scope_annotation_demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")        //we use scope to stop auto generation of objects by beans and make constructor work as normal
public class Customer {

	public Customer()
	{
		System.out.println("Constructor is executed");
	}
}
