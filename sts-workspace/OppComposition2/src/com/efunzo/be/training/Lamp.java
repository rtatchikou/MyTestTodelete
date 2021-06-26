package com.efunzo.be.training;

public class Lamp {

	private String style;
	
	

	public Lamp(String style) {
		super();
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Lamp [style=" + style + "]";
	}
	
	
	public void turnOn() {
		
		System.out.println("Lamp --> The lamp is on");
	}
	
}
