package com.java.s1.same;

public class Square {
	int width;
	int height;
	
	public boolean same(Square sq2) {
		if(this.width == sq2.width && this.height == sq2.height) {
			return true;	
		}else {
			return false;
		}
		
	}

}
