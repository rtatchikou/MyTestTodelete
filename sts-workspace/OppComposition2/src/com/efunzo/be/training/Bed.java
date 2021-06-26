package com.efunzo.be.training;

public class Bed {
	
	private String style;
	private int size;
	
	
	
	public Bed(String style, int size) {
		super();
		this.style = style;
		this.size = size;
	}
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Bed [style=" + style + ", size=" + size + "]";
	}
	
	public void make() {
		
		System.out.println("Bed --> Making my bed");
	}

}
