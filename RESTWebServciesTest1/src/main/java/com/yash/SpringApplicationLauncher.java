package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.yash.controllers.EmployeeController;

@SpringBootApplication
public class SpringApplicationLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(SpringApplicationLauncher.class, args);
		
	}

}
