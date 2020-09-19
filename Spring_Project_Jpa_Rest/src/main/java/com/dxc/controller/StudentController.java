package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dao.StudentRepository;
import com.dxc.model.Student;
//enter
@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("students")
	public List<Student> getStudents()
	{
		List<Student> students = (List<Student>) studentRepository.findAll();
		return students;
	}
}
