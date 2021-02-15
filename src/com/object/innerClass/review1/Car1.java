package com.object.innerClass.review1;

public class Car1 {
	String name;
	private class Engine1{
		public void run() {
			System.out.println(name+"启动了");
			System.out.println("内部类可以直接使用外部类的属性");
		}
	}

	public static void main(String[] args) {
		Car1 car1 =new Car1();
		car1.name="大奔";
		Engine1 engine1=car1.new Engine1();
		engine1.run();

	}

}
