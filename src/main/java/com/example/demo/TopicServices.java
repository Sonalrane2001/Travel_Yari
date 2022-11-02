package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	@Autowired
	public TopicRepository topicRepository;
	public Iterable<Topic> getAllTopics()
	{
		return topicRepository.findAll();
	}
	public Optional<Topic> getTopic(int topicId)
	{
		return topicRepository.findById(topicId);
	}
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	public void updateTopic(Topic topic,int topicId)
	{
		topicRepository.save(topic);
	}
	public void deleteTopic(int topicId)
	{
		topicRepository.deleteById(topicId);
	}
}
