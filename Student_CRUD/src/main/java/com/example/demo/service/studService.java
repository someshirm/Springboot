package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;


public interface studService {

	Student addStudent(Student stud);
	Student updateStudent(Student stud ,int roll);
	void deleteStudentByID(int roll);
	Student displayStudent(int roll);
	List<Student> displayAll();

	
}
