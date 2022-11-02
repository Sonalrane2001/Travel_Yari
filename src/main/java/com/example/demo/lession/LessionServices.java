package com.example.demo.lession;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.course.Course;

@Service
public class LessionServices {
	@Autowired
	public LessionRepository lessionRepository;
	public Iterable<Lession> getAllLessions()
	{
		return lessionRepository.findAll();
	}
	public Optional<Lession> getLession(int lessionId)
	{
		return lessionRepository.findById(lessionId);
	}
	public void addLession(Lession lession)
	{
		lessionRepository.save(lession);
	}
	public void updateLession(Lession lession)
	{
		lessionRepository.save(lession);
	}
	public void deleteLession(int lessionId)
	{
		lessionRepository.deleteById(lessionId);
	}
}
