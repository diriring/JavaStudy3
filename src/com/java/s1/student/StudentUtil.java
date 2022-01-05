package com.java.s1.student;

import java.util.Scanner;

public class StudentUtil {
	
	//학생 객체를 생성하고 정보를 입력 받는 곳

	Scanner sc = new Scanner(System.in);	
	
	public Student[] makeStuents() {
		//학생의 수를 입력받음
		//키보드로부터 이름, 번호, 국어, 영어, 수학점수 입력받은 것을 리턴
		//학생들의 정보를 리턴
		
		System.out.println("학생 수를 입력");
		int input = sc.nextInt();
		
		Student [] arr = new Student[input];
		
		for(int i=0;i<arr.length;i++) {
			Student student = new Student();
			
			System.out.println("이름을 입력");
			student.name = sc.next();
			System.out.println("번호를 입력");
			student.num = sc.nextInt();
			System.out.println("국어점수를 입력");
			student.kor = sc.nextInt();
			System.out.println("영어점수를 입력");
			student.eng = sc.nextInt();
			System.out.println("수학점수를 입력");
			student.math = sc.nextInt();
			
			arr[i] = student;
		}
		
		return arr;
		
	}
	
	public Student makeStudent() {
		//키보드로부터 이름, 번호, 국어, 영어, 수학점수 입력받은 것을 리턴
		

		System.out.println("이름을 입력");
		String name = sc.next();
		System.out.println("번호를 입력");
		int num = sc.nextInt();
		System.out.println("국어점수를 입력");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력");
		int math = sc.nextInt();
		
		Student std  = new Student();
		std.name = name;
		std.num = num;
		std.kor = kor;
		std.eng = eng;
		std.math = math;
		
		return std;
		
	}

}
