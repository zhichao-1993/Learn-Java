package com.object.innerClass.review;

public class Car2 {
	String name;
	private class Engine2{
		public void run() {
			System.out.println(name+"的发动机启动了");
		}
	}
	public Engine2 getEngine2() {
		return new Engine2();
	}

	public static void main(String[] args) {
		Car2 car2=new Car2();
		car2.name="大奔";
		Engine2 engine2=car2.getEngine2();
		engine2.run();

	}

}
