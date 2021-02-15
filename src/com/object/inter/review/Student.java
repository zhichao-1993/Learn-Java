package com.object.inter.review;

public class Student implements Person{
	@Override
	public void walk() {
		System.out.println(Person.NAME);
		System.out.println("走路");
	}
	@Override
	public void run() {
		System.out.println("跑步");
	}

	public static void main(String[] args) {
		Student student=new Student();
		student.walk();
		student.run();
	

	}

}
