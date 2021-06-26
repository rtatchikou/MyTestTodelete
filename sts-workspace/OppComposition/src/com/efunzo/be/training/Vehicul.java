package com.efunzo.be.training;


public class Vehicul {
	
	private String name;
	

	public Vehicul(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Vehicul [name=" + name + "]";
	}
	
	

}
