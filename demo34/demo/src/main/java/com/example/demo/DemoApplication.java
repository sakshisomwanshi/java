package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(DemoApplication.class, args);

		studentRepository stud = context.getBean(studentRepository.class);
		// create row
		student st = new student(100, "abc");
		stud.save(st);
		System.out.println("Record saved");
		student st1 = new student(90, "aabc");
		stud.save(st1);
		System.out.println("Record saved");
		student st2 = new student(90, "aabc");
		stud.delete(st2);
		System.out.println("record deleted");

	}

}
