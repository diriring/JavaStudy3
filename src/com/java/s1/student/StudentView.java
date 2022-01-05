package com.java.s1.student;

public class StudentView {
	
	//출력 전용
	
	//학생의 모든 정보를 출력하는 메소드
	public void studentView(Student student) {
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t");
		System.out.println("--------------------------------------");
			
		System.out.print(student.name + "\t");
		System.out.print(student.num + "\t");
		System.out.print(student.kor + "\t");
		System.out.print(student.eng + "\t");
		System.out.println(student.math + "\t");		
		
	}
	
	public void viewStudents(Student [] students) {
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t");
		System.out.println("---------------------------------------");
		
		for(int i=0; i<students.length; i++) {
			
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].num + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.println(students[i].math + "\t");
		
		}
		
	}
	
	//문자열 출력
	public void viewMessage(String message) {
		//문자열 출력
		System.out.println("-----------------------------");
		System.out.println(message);
		System.out.println("-----------------------------");
	}

}
