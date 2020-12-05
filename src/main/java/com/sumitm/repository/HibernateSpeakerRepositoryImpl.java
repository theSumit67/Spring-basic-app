package com.sumitm.repository;


import java.util.List;
import java.util.ArrayList;

import com.sumitm.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();

		speaker.setFirstName("Sumit");
		speaker.setLastName("Maurya");
		
		speakers.add(speaker);

		return speakers;
	}
}
