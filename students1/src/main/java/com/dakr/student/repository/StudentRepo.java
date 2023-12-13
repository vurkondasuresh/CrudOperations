package com.dakr.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.student.entites.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
