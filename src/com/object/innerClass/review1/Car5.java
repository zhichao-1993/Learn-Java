package com.object.innerClass.review1;

public class Car5 {
	String brand="宝马";
	static String name="外部类的静态属性";
	static class Engine5{
		public void run() {
			Car5 car5=new Car5();
			System.out.println(car5.brand);
			System.out.println("静态内部类使用外部类的非静态属性，要实例外部类，通过外部类来调用");
			System.out.println(name);
			System.out.println("静态内部类可以直接使用外部类的静态属性");
		}
	}

	public static void main(String[] args) {
		Engine5 engine5=new Engine5();
		engine5.run();

	}

}
