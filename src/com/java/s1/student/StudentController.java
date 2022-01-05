package com.java.s1.student;

import java.util.Scanner;

public class StudentController {
	

	public void start() {
		
		Scanner sc = new Scanner(System.in);
		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView();
		
		boolean check = true;
		Student [] std = null;
		while(check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 프로그램 종료");
			
			//switch case 활용
			System.out.println("번호를 입력해주세요");
			int input = sc.nextInt();
			
		    switch(input) {
		    case 1:
		    	System.out.println("정보를 입력합니다");
		    	std =su.makeStuents();
		        break;
		    case 2:
		    	System.out.println("정보를 출력합니다");
		    	sv.viewStudents(std);
		        break;
		    case 3:
		    	System.out.println("프로그램을 종료합니다");
		    	check = false;
		        break;
		    }
		}
	}

}
