package com.sumitm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sumitm.service.SpeakerService;
//import com.sumitm.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		// this line loads spring, creates registry of specified beans in AppConfig class
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

		// SpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
