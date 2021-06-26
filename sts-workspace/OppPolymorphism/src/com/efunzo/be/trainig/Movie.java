package com.efunzo.be.trainig;

public class Movie {
	
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}

	public String getDescription() {
		
		return "No description";
	}
	
	public int getDuration() {
		
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
