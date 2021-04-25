package com.example.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.project.model.Course;
import com.example.demo.project.repository.CourseRepository;



@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class CourseController {
	@Autowired
	private CourseRepository courseRepository;
	
	
	@GetMapping("/courses")
	public List<Course> getAllCourse()
	{
		return courseRepository.findAll();
	}

}
