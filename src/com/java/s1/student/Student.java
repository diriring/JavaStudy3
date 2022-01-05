package com.java.s1.student;

public class Student {
	
	//Data 저장 용도
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void makeTotal() {
		//System.out.println("참조변수 this");
		//System.out.println("참조변수 this: " + this); //this에 만들어진 객체의 "주소"가 들어간다
		total = kor + eng + math; //멤버변수 total
		avg = total/3.0;
		
		//평균 계산
		//국영수 입력받고 이 메서드를 호출하면 바로 계산이 되게끔
	
	}
	
	
	
}

//참조변수 this
/*
	객체 생성시 만들어지는 변수
	만들어진 객체의 주소를 담고있는 참조변수
	class 내부의 메서드 내에서만 사용 가능
	개발자가 선언하는 변수가 아니라 자동으로 만들어지는 변수
	생략 가능
	this.멤버변수명
	this.멤버메서드명()
	지역변수와 멤버변수를 구분하기 위해 사용
	
*/