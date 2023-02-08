package com.example;

import com.example.tdd.FizzBuzz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestDemoApplication.class, args);
		var fizz = new FizzBuzz();
		for(int i = 1; i <= 100; i++)
			System.out.println(fizz.compute(i));
	}

}
