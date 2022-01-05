package com.java.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		
		//1. MainMethod
		//	1)프로그램 Start와 초기화
		//	2)Test
		
		System.out.println("MainMethod Start");
		
		ReturnStudy rs = new ReturnStudy();
		rs.test1();
		
		int count = rs.test2();
		System.out.println("Main : " + count);
		
		String chars = rs.test3();
		System.out.println(chars);
		
		System.out.println(Math.random());
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("age : " + age);
		
		System.out.println("MainMethod Finish");

	}

}
