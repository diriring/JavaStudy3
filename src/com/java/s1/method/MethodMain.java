package com.java.s1.method;

public class MethodMain {

	public static void main(String[] args) {
		
		System.out.println("MainMethod Start");
		
		ReturnStudy rs = new ReturnStudy();
		rs.test1();
		
		int count = rs.test2();
		System.out.println("Main : " + count);
		
		String chars = rs.test3();
		System.out.println(chars);
		
		System.out.println(Math.random());
		
		
		System.out.println("MainMethod Finish");

	}

}
