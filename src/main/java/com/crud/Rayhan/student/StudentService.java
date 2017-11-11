package com.crud.Rayhan.student;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	EntityManager entityManager;
	
	public void save(StudentEntity studentEntity){
		studentRepository.save(studentEntity);
	}
	
	public List<StudentEntity> list(){
		return studentRepository.findAll();
		
	}
	
	public void delete(int id){
		studentRepository.delete(id);
		
	}
	
	public StudentEntity edit(int id){
		
		return studentRepository.getOne(id);
		
	}
	

}


