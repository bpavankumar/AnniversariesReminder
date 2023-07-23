package com.anniversaries.reminder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anniversaries.reminder.entity.WeddingAnniversaries;
import com.anniversaries.reminder.repository.WeddingsRepository;

@Service
public class WeddingsService {

	@Autowired
	public WeddingsRepository weddingsRepository;

	public List<WeddingAnniversaries> getAllWeddingAnniversaries() {
		List<WeddingAnniversaries> weddings = weddingsRepository.fetchAllWeddings();
		return weddings;
	}

	public boolean addAWedding(WeddingAnniversaries wedding) {
		try {
			weddingsRepository.save(wedding);
			return true;
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return false;
	}

	public boolean deleteAWedding(String weddingId) {
		try {
			weddingsRepository.deleteById(Integer.parseInt(weddingId));
			return true;
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		return false;
	}
}