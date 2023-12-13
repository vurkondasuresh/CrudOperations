package com.dakr.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.student.entites.Student;
import com.dakr.student.service.StudentService;

@RestController
public class StudentController
{

	@Autowired
	private StudentService service;
	
	
//	@PutMapping is used for update query
//	@GetMapping isused for retrive the element form db.
//	@DeleteMapping usaly used to delete the data from db.
	@PostMapping("/save") // is used to create the data.
	public String save(@RequestBody Student student) {
		String message=null;
		Student s1=service.saveStudent(student);
		
		if(s1!=null) {
			message="Data successfully Saved";
		}
		else {
			message="Data is not saved";
		}
		return message;
	}


}
