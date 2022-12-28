package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1springbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1springbootApplication.class, args);
		System.out.println("Thread name"+Thread.currentThread().getName());
	}

}
