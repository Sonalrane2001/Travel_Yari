package com.example.demo.course;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServices {
	@Autowired
	public CourseRepository courseRepository;
	public Iterable<Course> getAllCourses()
	{
		return courseRepository.findAll();
	}
	public Optional<Course> getCourse(int courseId)
	{
		return courseRepository.findById(courseId);
	}
	public void addCourse(Course course)
	{
		courseRepository.save(course);
	}
	public void updateCourse(Course course)
	{
		courseRepository.save(course);
	}
	public void deleteTopic(int courseId)
	{
		courseRepository.deleteById(courseId);
	}
}
