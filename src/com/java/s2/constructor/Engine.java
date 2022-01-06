package com.java.s2.constructor;

public class Engine {
	
	String name = "V1";
	String fuel = "F1";
	
	{
		//초기화 블럭
		name = "V2";
		this.fuel = "F2";
	}
	
	public Engine() {
		this.name = "V3";
		this.fuel = "F3";
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.fuel);
	}
}
