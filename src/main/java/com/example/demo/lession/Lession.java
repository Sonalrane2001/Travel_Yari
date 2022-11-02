package com.example.demo.lession;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.course.Course;

@Entity
public class Lession {
	@Id
	public int lessionId;
	public String lessionName;
	public String lessionDesc;
	@ManyToOne
	public Course course;
	public int getLessionId() {
		return lessionId;
	}
	public void setLessionId(int lessionId) {
		this.lessionId = lessionId;
	}
	public String getLessionName() {
		return lessionName;
	}
	public void setLessionName(String lessionName) {
		this.lessionName = lessionName;
	}
	public String getLessionDesc() {
		return lessionDesc;
	}
	public void setLessionDesc(String lessionDesc) {
		this.lessionDesc = lessionDesc;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Lession(int lessionId, String lessionName, String lessionDesc, Course course) {
		super();
		this.lessionId = lessionId;
		this.lessionName = lessionName;
		this.lessionDesc = lessionDesc;
		this.course = course;
	}
	public Lession()
	{
		
	}
}
