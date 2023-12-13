package com.dakr.student.service;

import java.util.List;

import com.dakr.student.entites.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public void deleteStudent(Integer id);
	public Student updateStudent(Student student ,Integer id);
	public Student getById(Integer id);
	public List<Student> getallStudent();

	

}
