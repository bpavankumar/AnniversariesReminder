package com.anniversaries.reminder.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "deaths")
public class DeathAnniversaries {

	@SequenceGenerator(name="Deaths_Generator", sequenceName="Deaths_Sequence")
	@Id @GeneratedValue(generator="Deaths_Generator")
	private int deathId;
	private String deceased;
	private Date deathDate;
	private String relation;

	public int getDeathId() {
		return deathId;
	}

	public void setDeathId(int deathId) {
		this.deathId = deathId;
	}

	public String getDeceased() {
		return deceased;
	}

	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
}