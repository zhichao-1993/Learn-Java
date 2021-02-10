package com.object.method.review;

public class Student {
	//方法的重载
	public void study() {
		System.out.println("是好学生");
	}
	public void study(String name) {
		System.out.println(name+"好学生");
	}
	public void study(String name,int age) {
		System.out.println(name+"今年"+age+"岁");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.study();
		student.study("老二");
		student.study("老二", 17);
		String str="0123456789";
		String a=str.substring(1);
		String b=str.substring(2, 8);
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
