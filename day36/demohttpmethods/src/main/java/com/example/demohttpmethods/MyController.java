package com.example.demohttpmethods;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {
	@Autowired
	private studentRepository stud;
	
	@GetMapping("/students")
	public List<student> getAllstudents(){
		return stud.findAll();
	}
}
