package com.anniversaries.reminder.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "birthdays")
public class Birthdays {

	@SequenceGenerator(name="Birthdays_Generator", sequenceName="Birthdays_Sequence")
	@Id @GeneratedValue(generator="Birthdays_Generator")
	private int birthdayId;
	private String birthdayBaby;
	private Date birthDate;
	private String relation;

	public int getBirthdayId() {
		return birthdayId;
	}

	public void setBirthdayId(int birthdayId) {
		this.birthdayId = birthdayId;
	}

	public String getBirthdayBaby() {
		return birthdayBaby;
	}

	public void setBirthdayBaby(String birthdayBaby) {
		this.birthdayBaby = birthdayBaby;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public String toString() {
		return "Birthdays [birthdayId=" + birthdayId + ", birthdayBaby=" + birthdayBaby + ", birthDate=" + birthDate
				+ ", relation=" + relation + "]";
	}
}