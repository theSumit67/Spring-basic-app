package com.sumitm.service;


import java.util.List;
import com.sumitm.repository.SpeakerRepository;
import com.sumitm.model.Speaker;

public class SpeakerServiceImpl implements SpeakerService {

	// Hard coded, can be solved using spring
	private SpeakerRepository repository; // = new HibernateSpeakerRepositoryImpl();
	
	// default constructor required for auto wiring byType
	public SpeakerServiceImpl() {

	}

	public SpeakerServiceImpl(SpeakerRepository repository) {
		this.repository = repository;
	}

	public List<Speaker> findAll(){
		return repository.findAll();
	}

	// matches this name to xml bean config 
	// when auto wiring this method gets called automatically, since it has SpeakerRepository as property, so it matches name setSpeakerRepository
	public void setSpeakerRepository(SpeakerRepository repository) {
		this.repository = repository;
	}

}
