package com.efunzo.be.training;

public class Wall {

	private String direction;
	private Door door;
	
	public Wall(String direction, Door door) {
		super();
		this.direction = direction;
		this.door = door;
	}
	
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Door getDoor() {
		return door;
	}
	public void setDoor(Door door) {
		this.door = door;
	}
	
	
	@Override
	public String toString() {
		return "Wall [direction=" + direction + ", door=" + door + "]";
	}
	
	
}
