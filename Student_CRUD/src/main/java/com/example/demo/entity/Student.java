package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_roll;
	@Column(name = "name")
	private String student_name;
	@Column(name = "class")
	private int student_class;
	@Column(name = "address")
	private String student_address;
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String student_name, int student_class, String student_address) {
		 
		this.student_name = student_name;
		this.student_class = student_class;
		 this.student_address = student_address;
	}


	public int getStudent_roll() {
		return student_roll;
	}
	public void setStudent_roll(int student_roll) {
		this.student_roll = student_roll;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_class() {
		return student_class;
	}
	public void setStudent_class(int student_class) {
		this.student_class = student_class;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
	 	this.student_address = student_address;
	}
	
}
