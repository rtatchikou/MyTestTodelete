package com.efunzo.be.training.extend;

public class Car {

	private String color;
	private String mark;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", mark=" + mark + "]";
	}
	public Car(String color, String mark) {
		super();
		this.color = color;
		this.mark = mark;
	}
	
	
	
	
	
}
