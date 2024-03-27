package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repos.studentRepo;
@Service
public class StudentServiceImpl implements studService{
    @Autowired
	private studentRepo studrepo;
	@Override
	public Student addStudent(Student stud) {
		return this.studrepo.save(stud);
		  
	}

	@Override
	public Student updateStudent(Student stud, int roll) {
		 Student student = this.studrepo.findById(roll).orElseThrow(()->new RuntimeException("Student does not exist"));
		 student.setStudent_name(stud.getStudent_name());
		 student.setStudent_class(stud.getStudent_class());
		 student.setStudent_address(stud.getStudent_address());
		 this.studrepo.save(student);
		 return student;
	}

	@Override
	public void deleteStudentByID(int roll) {
		 this.studrepo.deleteById(roll);
		 
	}

	@Override
	public Student displayStudent(int roll) {
		return this.studrepo.findById(roll).orElseThrow(()->new RuntimeException("Student is not found"));
	}

	@Override
	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return this.studrepo.findAll();
	}

}
