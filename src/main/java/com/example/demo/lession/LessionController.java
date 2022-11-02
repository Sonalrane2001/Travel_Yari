package com.example.demo.lession;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Topic;
import com.example.demo.course.Course;

@RestController
public class LessionController {
	@Autowired
	public LessionServices lessionServices;
	@RequestMapping("/topics/{topicId}/courses/{courseId}/lessions")
	public Iterable<Lession> getAllLessions()
	{
		return lessionServices.getAllLessions();
	}
	@RequestMapping("/topic/{topicId}/course/{courseId}/lession/{lessionId}")
	public Optional<Lession> getLession(@PathVariable int topicId,@PathVariable int courseId,@PathVariable int lessionId)
	{
		return lessionServices.getLession(lessionId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic/{topicId}/course/{courseId}/lession")
	public void addLession(@RequestBody Lession lession,@PathVariable int courseId,@PathVariable int topicId)
	{
		lession.setCourse(new Course(courseId,"","",new Topic(topicId,"","")));
		lessionServices.addLession(lession);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{topicId}/course/{courseId}/lession/{lessionId}")
	public void updateLession(@RequestBody Lession lession,@PathVariable int topicId,@PathVariable int courseId,@PathVariable int lessionId)
	{
		lession.setCourse(new Course(courseId,"","",new Topic(topicId,"","")));
		lessionServices.updateLession(lession);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{topicId}/course/{courseId}/lession/{lessionId}")
	public void deleteLession(@PathVariable int lessionId)
	{
		lessionServices.deleteLession(lessionId);
	}
}
