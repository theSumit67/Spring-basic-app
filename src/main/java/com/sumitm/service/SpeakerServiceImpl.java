package com.sumitm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sumitm.repository.HibernateSpeakerRepositoryImpl;
import com.sumitm.repository.SpeakerRepository;
import com.sumitm.model.Speaker;

public class SpeakerServiceImpl implements SpeakerService {

	// Hard coded, can be solved using spring
	private SpeakerRepository repository; // = new HibernateSpeakerRepositoryImpl();

	public SpeakerServiceImpl () {
		System.out.println("SpeakerServiceImpl no args constructor");
	}

	public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
		System.out.println("SpeakerServiceImpl speakerRepository constructor");
		repository = speakerRepository;
	}

	public List<Speaker> findAll(){
		return repository.findAll();
	}
	
	@Autowired
	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}	
	
}
