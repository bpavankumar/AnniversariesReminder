package com.anniversaries.reminder.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "work")
public class WorkAnniversaries {

	@SequenceGenerator(name="Works_Generator", sequenceName="Works_Sequence")
	@Id @GeneratedValue(generator="Works_Generator")
	private int workId;
	private String colleague;
	private Date joiningDate;
	private String relation;

	public int getWorkId() {
		return workId;
	}

	public void setWorkId(int workId) {
		this.workId = workId;
	}

	public String getColleague() {
		return colleague;
	}

	public void setColleague(String colleague) {
		this.colleague = colleague;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
}