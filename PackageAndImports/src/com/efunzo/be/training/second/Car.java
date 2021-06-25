package com.efunzo.be.training.second;

public class Car {
	
	private int price;
	private String mark;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", mark=" + mark + "]";
	}
	public Car(int price, String mark) {
		super();
		this.price = price;
		this.mark = mark;
	}
	
	
		

}
