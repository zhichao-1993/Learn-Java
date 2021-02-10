package com.object.inter;

public class Student implements Person{
	@Override
	public void walk() {
		System.out.println("走路");
	}
	@Override
	public void run() {
		System.out.println("跑步");
	}
	@Override
	public void eat() {
		Person.super.eat();
		System.out.println("喝饮料");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.walk();
		student.run();
		String name=Person.NAME;
		System.out.println(name);
		student.eat();
		student.walk();
		Person.sayHello();

	}

}
