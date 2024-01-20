package com.swagger_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagger_demo.model.course;
import com.swagger_demo.service.courseServices;

@RestController
//@RequestMapping("/course")
@RequestMapping("api/v1")
public class courseController {

	@Autowired
	private courseServices plan;
	
	@GetMapping("/getCourses")
	public List<course> getCourses() {
		return plan.getCourses();
	}
	
	@PostMapping("/addCourse")
	public course addCourse(@RequestParam("course") course course) {
		return plan.addCourse(course);
	}
	
	@DeleteMapping("/deleteCourse")
	public List<course> deleteCourse(@RequestParam("courseId") int courseId) {
		return plan.deleteCourse(courseId);
	}
}
