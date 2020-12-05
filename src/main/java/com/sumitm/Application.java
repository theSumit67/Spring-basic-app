package com.sumitm;

import com.sumitm.service.SpeakerService;
import com.sumitm.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		SpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
