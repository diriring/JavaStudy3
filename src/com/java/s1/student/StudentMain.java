package com.java.s1.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentUtil su = new StudentUtil();
		
		Student [] std = su.makeStuents();
		
		StudentView sv = new StudentView();
		sv.viewStudents(std);
		
		Student student = su.search(std);
		if(student != null) {
			sv.studentView(student);
		}else {
			sv.viewMessage("학생이 없다");
		}
		

	}

}
