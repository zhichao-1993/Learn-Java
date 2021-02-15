package com.object.innerClass.review1;

public class Car4 {
	static String name="奔奔";
	static class Engine4{
		public void run() {	
			System.out.println(name+"发动机启动了");
			System.out.println("静态内部类可以直接使用外部类静态属性");
			System.out.println("静态内部类的run方法");
			System.out.println("静态内部类实例不需要借助外部类");
		}
	}

	public static void main(String[] args) {
		Engine4 engine4=new Engine4();
		engine4.run();

	}

}
