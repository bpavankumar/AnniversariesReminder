package com.anniversaries.reminder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anniversaries.reminder.entity.WorkAnniversaries;
import com.anniversaries.reminder.repository.WorkRepository;

@Service
public class WorksService {

	@Autowired
	public WorkRepository worksRepository;

	public List<WorkAnniversaries> getAllWorkAnniversaries() {
		List<WorkAnniversaries> workAnniversaries = worksRepository.fetchAllWorkAnniversaries();
		return workAnniversaries;
	}
}