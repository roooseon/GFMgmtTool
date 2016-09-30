package com.gfmgmttool.model;

public class Girlfriend {
	private int gfId;
	private String name;
	private int priority;
	
	public Girlfriend(int girlID, String girlName, int girlPriority){
		gfId = girlID;
		name = girlName;
		priority = girlPriority;
	}

	public int getGfID() {
		return gfId;
	}

	public void setGfID(int gfID) {
		this.gfId = gfID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
