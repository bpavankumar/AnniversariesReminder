package com.anniversaries.reminder.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "weddings")
public class WeddingAnniversaries {

	@SequenceGenerator(name="Weddings_Generator", sequenceName="Weddings_Sequence")
	@Id @GeneratedValue(generator="Weddings_Generator")
	private int weddingId;
	private String weddedCouple;
	private Date weddingDate;
	private String relation;

	public int getWeddingId() {
		return weddingId;
	}

	public void setWeddingId(int weddingId) {
		this.weddingId = weddingId;
	}

	public String getWeddedCouple() {
		return weddedCouple;
	}

	public void setWeddedCouple(String weddedCouple) {
		this.weddedCouple = weddedCouple;
	}

	public Date getWeddingDate() {
		return weddingDate;
	}

	public void setWeddingDate(Date weddingDate) {
		this.weddingDate = weddingDate;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
}