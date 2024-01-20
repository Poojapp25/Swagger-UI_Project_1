package com.swagger_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger_demo.dao.courseDao;
import com.swagger_demo.model.course;

@Service
public class courseService implements courseServices{

	@Autowired 
	private courseDao dao;
	
	@Override
	public course addCourse(course course) {
		dao.save(course);
		return course;
	}	
	@Override
	public List<course> getCourses(){
		return dao.findAll();		
	}
	
	@Override
	public List<course> deleteCourse(int courseId){
		dao.deleteById(courseId);
		return dao.findAll();
	}
}
