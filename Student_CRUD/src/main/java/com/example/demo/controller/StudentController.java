package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImpl;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentServiceImpl studserviceImpl;
	@GetMapping(value = "/list")
	public List<Student> getAllStudentsList(){
		return this.studserviceImpl.displayAll();
	}
	@GetMapping(value = "/getById/{roll}")
	public ResponseEntity<Student> getStudentByID (@PathVariable int roll) {
		Student student =this.studserviceImpl.displayStudent(roll);
		return ResponseEntity.ok(student);
	}
	@PostMapping(value = "/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stud) {
		Student newStudent = this.studserviceImpl.addStudent(stud);
		return new ResponseEntity<Student>(newStudent, HttpStatus.CREATED);
	}
	@PutMapping(value = "/update/{roll}")
	public  ResponseEntity<Student> updateStudent(@RequestBody Student stud, @PathVariable int roll) {
		Student updated = this.studserviceImpl.updateStudent(stud, roll);
		return new ResponseEntity<Student>(updated, HttpStatus.OK);
	}
	@DeleteMapping(value = "/delete/{roll}")
	public void removeStudent(@PathVariable int roll) {
		this.studserviceImpl.deleteStudentByID(roll);
	}
	

}
