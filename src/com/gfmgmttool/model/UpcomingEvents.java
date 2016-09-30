package com.gfmgmttool.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class UpcomingEvents {
	private int gfId;
	private String event, location, note;
	LocalDate date;
	LocalTime time;

	public int getGfId() {
		return gfId;
	}

	public void setGfId(int gfId) {
		this.gfId = gfId;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}
}
