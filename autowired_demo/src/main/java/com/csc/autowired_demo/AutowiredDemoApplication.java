package com.csc.autowired_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiredDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(AutowiredDemoApplication.class, args);
	    Customer1 c1 = var.getBean(Customer1.class);
	    c1.show();
	}

}
