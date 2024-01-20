package com.swagger_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagger_demo.model.course;

@Repository
public interface courseDao extends JpaRepository<course, Integer>{

}
