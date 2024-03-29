package com.sb.security.SpringBootSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.security.SpringBootSecurity.entity.Student;

import jakarta.servlet.http.HttpServletRequest;




@RestController

public class StudentController {
	
	List<Student> students = new ArrayList<>(List.of(
			new Student(1,"Talha","Java"),new Student(2,"Huzaifa","C")));
	
	
	@GetMapping("students")
	public List<Student> getstudents() {
		return students;
	}
	@PostMapping("addstudents")
	public void addStudents(Student student) {
		 students.add(student);
	}
    @GetMapping("csrf")
	public CsrfToken getCsrftoken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

}
