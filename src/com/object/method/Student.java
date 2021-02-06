package com.object.method;

public class Student {
	//自定义方法的重载
	public void study() {
		System.out.println("同学好学！");
	}
	public void study(String name) {
		System.out.println(name+"同学好学！");
	}
	public void study(String name,int age) {
		System.out.println(name+"同学"+age+"岁");
	}
	public static void main(String[] arg) {
		Student student=new Student();
		String name="小明";
		int age = 13;
		student.study();
		student.study(name);
		student.study(name,age);
	}
}
