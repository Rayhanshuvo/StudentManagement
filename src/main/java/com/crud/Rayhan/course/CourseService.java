package com.crud.Rayhan.course;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	EntityManager entityManager;
	
	public void save(CourseEntity courseEntity){
		courseRepository.save(courseEntity);
	}
	
	public List<CourseEntity> list(){
		return courseRepository.findAll();
		
	}
	
	public void delete(int id){
		courseRepository.delete(id);
		
	}
	
	public CourseEntity edit(int id){
		
		return courseRepository.getOne(id);
		
	}
	

}

