package com.example.demo;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	public TopicServices topicServices;
	
	@RequestMapping("/topics")
	public Iterable<Topic> getAllTopics()
	{
		return topicServices.getAllTopics();
	}
	@RequestMapping("/topic/{topicId}")
	public Optional<Topic> getTopic(@PathVariable int topicId)
	{
		return topicServices.getTopic(topicId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addTopic")
	public void addTopic(@RequestBody Topic topic)
	{
		topicServices.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/updateTopic/{topicId}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable int topicId)
	{
		topicServices.updateTopic(topic,topicId);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteTopic/{topicId}")
	public void deleteTopic(@PathVariable int topicId)
	{
		topicServices.deleteTopic(topicId);
	}
	
}
