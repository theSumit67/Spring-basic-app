package com.sumitm.service;


import java.util.List;
import com.sumitm.repository.HibernateSpeakerRepositoryImpl;
import com.sumitm.repository.SpeakerRepository;
import com.sumitm.model.Speaker;

public class SpeakerServiceImpl implements SpeakerService {

	// Hard coded, can be solved using spring
	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	
	public List<Speaker> findAll(){
		return repository.findAll();
	}
}
