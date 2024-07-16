package com.csc.scope_annotation_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeAnnotationDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(ScopeAnnotationDemoApplication.class, args);
		
	    //Customer c1=var.getBean(Customer.class);   
		
		
		//Bean automatically create objects for all class so constructors are automatically executed
		//To stop this autoGeneration of objects we use "Scope" annotation
		//After using Scope constructor stop auto executing so we need to create object
		
		
		
		  //Customer c2=var.getBean(Customer.class); 
		  //Customer c3=var.getBean(Customer.class);
		 
		
		//When 2 or more objects are created constructor will execute one time only in spring boot
		//here also we use scope annotation to make constructor execute as normal
		
		
	}

}
