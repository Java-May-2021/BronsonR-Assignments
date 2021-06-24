package com.bronson.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bronson.dojo.models.Answer;
import com.bronson.dojo.models.Question;
import com.bronson.dojo.models.Tag;
import com.bronson.dojo.repositories.AnsRepository;
import com.bronson.dojo.repositories.QueRepository;
import com.bronson.dojo.repositories.TagRepository;

@Service
public class SuperService {
	//created super service to implement all the repos into one system that can freely interact here if new methods 
	//needed to be added later on. Trying a different approach to method naming and service convention for the controller
	@Autowired
	private QueRepository qRepo;
	
	
	//find all
	public List<Question> getAllQue(){
		return this.qRepo.findAll();
	}
	
	//find by Id
	public Question getByQueId(Long id){
		return this.qRepo.findById(id).orElse(null);
	}
	
	//create query
	public Question createQuestion(Question query) {
		return this.qRepo.save(query);
	}
	
	
	@Autowired
	private AnsRepository aRepo;
	
	//find all
	public List<Answer> getAllAns(){
		return this.aRepo.findAll();
	}
	
	//find by Id
	public Answer getByAnsId(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	
	//create answer
	public Answer createAnswer(Answer response) {
		return this.aRepo.save(response);
	}
	
	@Autowired
	private TagRepository tRepo;

	//find all
	public List<Tag> getAllTag(){
		return this.tRepo.findAll();
	}
	
	//find by Id
	public Tag getByTagId(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	//create tag
	public Tag createTag(Tag subject) {
		return this.tRepo.save(subject);
	}
	
	
	
	//combine tags and questions together
	public void questTags(Question query, Tag tag) {
		List<Question> questTag = tag.getQueries();
		questTag.add(query);
		this.tRepo.save(tag);
	}
	
	
	
}
