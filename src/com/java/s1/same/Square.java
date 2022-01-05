package com.java.s1.same;

public class Square {
	int width;
	int height;
	
	public boolean same(Square sq1, Square sq2) {
		boolean check = false;
		if(sq1.width == sq2.width && sq1.height == sq2.height) {
			check = true;	
		}
		
		return check;
		
	}

}
