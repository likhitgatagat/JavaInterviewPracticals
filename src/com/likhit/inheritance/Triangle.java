package com.likhit.inheritance;

public class Triangle implements Shape {

	@Override
	public void printShape(String name) {
		System.out.println("I am a Triangle");

	}
	
	public void printNewMethod() {
		System.out.println("Undiscoverable");
	}
	
	public int hashCode() {
		return 29;
	}

	public static void main(String[] args) {
		Shape trianlge = new Triangle();
		System.out.println(trianlge.hashCode());
	}

}
