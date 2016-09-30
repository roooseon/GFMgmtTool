package com.gfmgmttool.model;

import java.time.LocalDate;

public class Description {
	Girlfriend gf;
	private int gfId, phone;
	private LocalDate Bday;
	private String address, favMovie, favColor, favFood, hobbies;

	public int getGfId() {
		return gfId;
	}

	public void setGfId(int gfId) {
		this.gfId = gfId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public LocalDate getBday() {
		return Bday;
	}

	public void setBday(LocalDate bday) {
		Bday = bday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFavMovie() {
		return favMovie;
	}

	public void setFavMovie(String favMovie) {
		this.favMovie = favMovie;
	}

	public String getFavColor() {
		return favColor;
	}

	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	public Girlfriend getGf (){
		return gf;
	}
	
	public void setGf(Girlfriend aGf){
		gf = aGf;
	}
}
