package com.java.s2.constructor;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();
		car.info();
		
		Car car2 = new Car("k3", "red");
		car2.info();
	}

}
