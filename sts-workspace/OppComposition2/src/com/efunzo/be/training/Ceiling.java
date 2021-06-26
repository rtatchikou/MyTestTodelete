package com.efunzo.be.training;

public class Ceiling {
	
	private int height;
	private String color;
	
	public Ceiling(int height, String color) {
		super();
		this.height = height;
		this.color = color;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ceiling [height=" + height + ", color=" + color + "]";
	}

	
	
}
