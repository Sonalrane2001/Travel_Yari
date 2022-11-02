package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	public int topicId;
	public String topicName;
	public String topicDesc;
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDesc() {
		return topicDesc;
	}
	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}
	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", topicName=" + topicName + ", topicDesc=" + topicDesc + "]";
	}
	public Topic(int topicId, String topicName, String topicDesc) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDesc = topicDesc;
	}
	public Topic()
	{
		
	}
}
