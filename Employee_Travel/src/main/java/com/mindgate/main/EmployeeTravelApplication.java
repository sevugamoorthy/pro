package com.mindgate.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class EmployeeTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTravelApplication.class, args);
		System.out.println("Employee Travel Is Deployed Successfully!");
		System.out.println("This is new change");
		System.out.println("This line is added by sibi");
		System.out.println("this line is added by priya");
	}

}
