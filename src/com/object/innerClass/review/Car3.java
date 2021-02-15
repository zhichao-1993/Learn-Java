package com.object.innerClass.review;

public class Car3 {
	String name;
	public void run(String name) {
		System.out.println(name+"跑起来了");
	}
	
	private class Engine3{
		private String name="引擎";
		public void run() {
			System.out.println(name+"发动了");
			System.out.println(Car3.this.name+"的发动机启动了");
			Car3.this.run(Car3.this.name);
		}
	}
	
	public Engine3 getEngine3() {
		return new Engine3();
	}

	public static void main(String[] args) {
		Car3 car3=new Car3();
		car3.name="奥迪";
		Engine3 engine3=car3.getEngine3();
		engine3.run();
	}

}
