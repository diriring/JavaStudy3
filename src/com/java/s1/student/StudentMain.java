package com.java.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		//makeStudent 호출
		//이름, 번호, 국어, 영어, 수학 출력
		
		StudentUtil su = new StudentUtil();

		Student std = su.makeStudent();
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t");
		System.out.println("-----------------------------------------");
		System.out.print(std.name + "\t");
		System.out.print(std.num + "\t");
		System.out.print(std.kor + "\t");
		System.out.print(std.eng + "\t");
		System.out.println(std.math + "\t");
		
		Student [] stds;
		stds = su.makeStuents();
		System.out.println("이름\t번호\t국어\t영어\t수학\t");
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<stds.length;i++) {
			System.out.print(stds[i].name + "\t");
			System.out.print(stds[i].num + "\t");
			System.out.print(stds[i].kor + "\t");
			System.out.print(stds[i].eng + "\t");
			System.out.println(stds[i].math + "\t");
		}

	}

}
