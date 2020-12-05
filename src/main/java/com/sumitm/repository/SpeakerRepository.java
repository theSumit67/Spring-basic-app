package com.sumitm.repository;

import java.util.List;

import com.sumitm.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}