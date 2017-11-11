package com.crud.Rayhan.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CourseTable")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String course1;
	String course2;
	

	public CourseEntity() {
		
	}
	public CourseEntity(int id, String course1, String course2) {
	
		this.id = id;
		this.course1 = course1;
		this.course2 = course2;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse1() {
		return course1;
	}
	public void setCourse1(String course1) {
		this.course1 = course1;
	}
	public String getCourse2() {
		return course2;
	}
	public void setCourse2(String course2) {
		this.course2 = course2;
	}
	
	
}
