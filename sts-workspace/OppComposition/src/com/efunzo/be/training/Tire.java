package com.efunzo.be.training;

public class Tire {
	
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Tire(int size) {
		super();
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tire [size=" + size + "]";
	}
	
	

}
