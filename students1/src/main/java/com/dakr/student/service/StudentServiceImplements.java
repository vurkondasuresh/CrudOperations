package com.dakr.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dakr.student.entites.Student;
import com.dakr.student.repository.StudentRepo;

@Service
public class StudentServiceImplements implements StudentService
{

	@Autowired
	private StudentRepo studentrepo;
	
	@Override
	public Student saveStudent(Student student) {
		Student s1 = studentrepo.save(student);
		return s1;
	}

	@Override
	public void deleteStudent(Integer id) {
		studentrepo.deleteById(id);
		
	}
	
	
	@Override
	public Student getById(Integer id) {
		Student s1 = studentrepo.findById(id).get();
		return null;
	}

	@Override
	public List<Student> getallStudent() {
		List<Student> list = studentrepo.findAll();
		return list;
	}

	@Override
	public Student updateStudent(Student student, Integer id)
	{
		Student s2 = studentrepo.findById(id).get();
		
		s2.setId(id);
		s2.setName(student.getName());
		s2.setCourse(student.getCourse());
		s2.setPhno(student.getPhno());
		
		return studentrepo.save(s2);
		
		 
	}

	
}
