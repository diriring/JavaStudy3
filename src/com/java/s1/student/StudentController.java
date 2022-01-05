package com.java.s1.student;

import java.util.Scanner;

public class StudentController {
	

	public void start() {
		
		Scanner sc = new Scanner(System.in);
		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView();
		
		boolean check = true;
		Student student = null;
		Student [] std = null;
		while(check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프로그램 종료");
			
			//switch case 활용
			System.out.println("번호를 입력해주세요");
			int input = sc.nextInt();
			
		    switch(input) {
		    case 1:
		    	System.out.println("정보를 입력합니다");
		    	std =su.makeStuents();
		        break;
		    case 2:
		    	if(std != null) {
			    	System.out.println("정보를 출력합니다");
			    	sv.viewStudents(std);
		    	}else {
		    		sv.viewMessage("학생 정보를 먼저 입력하세요");
		    	}
		        break;
		    case 3:
		    	System.out.println("번호를 입력하세요");
		    	if(std != null) {
			    	student = su.search(std);
			    	if(student != null) {
			    		sv.studentView(student);
			    	}else {
			    		sv.viewMessage("학생을 찾을 수 없습니다");
			    	}
		    	}else {
		    		sv.viewMessage("학생 정보를 먼저 입력하세요");
		    	}
		        break;
		    case 4:
		    	System.out.println("프로그램을 종료합니다");
		    	check = false;
		        break;
		    }
		}
	}

}
