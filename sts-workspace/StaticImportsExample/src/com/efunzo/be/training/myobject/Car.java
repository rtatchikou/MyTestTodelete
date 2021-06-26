package com.efunzo.be.training.myobject;

public class Car {
	
	
	private String color;
	private int price;
	
	public static int DEFAULT_PRICE = 3000;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + "]";
	}
	
	
	
	

}
