package com.swagger_demo.service;

import java.util.List;

import com.swagger_demo.model.course;

public interface courseServices {
	public course addCourse(course course);
	public List<course> getCourses();
	public List<course> deleteCourse(int courseId);
}
