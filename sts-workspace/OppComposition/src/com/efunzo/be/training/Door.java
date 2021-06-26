package com.efunzo.be.training;

public class Door {
	
	private boolean isOpen;

	public Door(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Override
	public String toString() {
		return "Door [isOpen=" + isOpen + "]";
	}
	
	

}
