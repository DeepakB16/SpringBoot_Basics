package com.csc.qualifier_annotation_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QualifierAnnotationDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(QualifierAnnotationDemoApplication.class, args);
		Customer c=var.getBean(Customer.class);
		c.order();
	}

}
