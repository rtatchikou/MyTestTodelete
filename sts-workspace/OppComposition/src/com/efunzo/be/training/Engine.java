package com.efunzo.be.training;

public class Engine {
	
	private int size;
	private boolean isStarted;
	
	public Engine(int size, boolean isStarted) {
		this.size = size;
		this.isStarted = isStarted;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	@Override
	public String toString() {
		return "Engine [size=" + size + ", isStarted=" + isStarted + "]";
	}
	
	
	

}
