package com.ifunzo.be.training;


public class Car {
	
	private int doors;
	private int wheeles;
	private String model;
    public String engine;
	private String colour;
	
	 private String getColour() {
		return colour;
	}
	 
	 public void setModel(String model) {
		 
		 if(model.equalsIgnoreCase("Mercedes")|| model.equalsIgnoreCase("Toyota")) {
			 
			 this.model= model;
			 
		 }else {
			 this.model= "Unknown";
		 }
	 }
	 
	 public String getModel() {
		 
		 return this.model;
	 }

}
