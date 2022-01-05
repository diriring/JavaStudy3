package com.java.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square sq1 = new Square();
		sq1.width = 4;
		sq1.height = 4;
		
		Square sq2 = new Square();
		sq2.width = 4;
		sq2.height = 4;
		
		System.out.println(sq1.same(sq1, sq2));

	}

}
