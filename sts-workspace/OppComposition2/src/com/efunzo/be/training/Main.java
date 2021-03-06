package com.efunzo.be.training;

public class Main {

	public static void main(String[] args) {
		
		Door door = new Door(false);
		
		Wall wall1 = new Wall("North", door);
		Wall wall2 = new Wall("South", null);
		Wall wall3 = new Wall("Est", null);
		Wall wall4 = new Wall("West", null);
		
		Ceiling ceiling = new Ceiling(8, "blue");
		
		Lamp lamp = new Lamp("Rustique");
		
		Bed bed = new Bed("Vintage", 140);
		
		BedRoom bedRoom = new BedRoom("Ostin", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		
		System.out.println(bedRoom);
		
		bedRoom.openTheDoor();
		
		System.out.println(bedRoom);
		
		bedRoom.getWall1().getDoor().setOpen(false);
		
		System.out.println(bedRoom);
		
		bedRoom.makeBed();
		
		bedRoom.trurnTheLampOn();
		
		bedRoom.getLamp().turnOn();
		
	}

}
