package com.csc.qualifier_annotation_demo;

import org.springframework.stereotype.Component;

@Component
public class Idli implements Ordering{

	public void order()
	{
		System.out.println("Ordering Idli...");
	}
}
