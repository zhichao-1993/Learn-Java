package com.object.inter.review;

public class Student1 implements Person1{
	@Override
	public void run() {
		System.out.println("重写Person1接口中的run()方法");
	}
	@Override
	public void eat() {
		Person1.super.eat();
		System.out.println("接口名.super.方法名的方式来调用Person1接口中的默认方法");
	}
	public static void main(String[] args) {
		Student1 student1=new Student1();
		student1.run();
		student1.eat();
	}
}
