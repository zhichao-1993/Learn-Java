package com.object.innerClass.review;

public class Car6 {
	String brand="宝马";
	static String NAME="外部类的静态属性";
	static class Engine6{
		public void run() {
			System.out.println(NAME);
		}
	}

	public static void main(String[] args) {
		Engine6 engine6=new Engine6();
		engine6.run();
		System.out.println("静态内部类中可以直接使用外部类的属性");

	}

}
