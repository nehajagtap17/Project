package com.example.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.project.model.Course;

public interface CourseRepository extends JpaRepository<Course,String> {

}
