package com.sumitm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sumitm.repository.HibernateSpeakerRepositoryImpl;
import com.sumitm.repository.SpeakerRepository;
import com.sumitm.service.SpeakerService;
import com.sumitm.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"com.sumitm"})
public class AppConfig {
	
	// name optional
	@Bean(name="speakerService")
	public SpeakerService getSpeakerService() {
		// @AutoWired setter injection
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		//SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
		// Since Beans are singleton it will always return same service instance
//		service.setRepository(getSpeakerRepository()); // setter injection
		return service;
	}
	
	@Bean(name="speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
}
