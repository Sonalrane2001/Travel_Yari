package com.example.demo.course;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Topic;


@RestController
public class CourseController {
	@Autowired
	public CourseServices courseServices;
	@RequestMapping("/topics/{topicId}/courses")
	public Iterable<Course> getAllCourses()
	{
		return courseServices.getAllCourses();
	}
	@RequestMapping("/topic/{topicId}/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable int topicId,@PathVariable int courseId)
	{
		return courseServices.getCourse(courseId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic/{topicId}/addCourse")
	public void addCourse(@RequestBody Course course,@PathVariable int topicId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseServices.addCourse(course);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{topicId}/updateCourse/{courseId}")
	public void updateCourse(@RequestBody Course course,@PathVariable int topicId,@PathVariable int courseId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseServices.updateCourse(course);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{topicId}/deleteCourse/{courseId}")
	public void deleteCourse(@PathVariable int courseId)
	{
		courseServices.deleteTopic(courseId);
	}
}
