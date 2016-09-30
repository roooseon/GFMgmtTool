package com.gfmgmttool.model;

import java.time.LocalDate;

public class SpecialDays {
	private int gfId;
	private LocalDate date;
	private String event, description;

	public int getGfId() {
		return gfId;
	}

	public void setGfId(int gfId) {
		this.gfId = gfId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
