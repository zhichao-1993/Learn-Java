package com.object.innerClass.review;

public class Car4 {
	String name;
	public void run(String name) {
		System.out.println(name+"的发动机启动了");
	}
	private  class Engine4{
		private String name="引擎";
		public void run() {
			System.out.println(name+"启动了");
			System.out.println(Car4.this.name+"发动了");
			Car4.this.run(Car4.this.name);
		}
	}
	public Engine4 getEngine4() {
		return new Engine4();
	}

	public static void main(String[] args) {
		Car4 car4=new Car4();
		car4.name="宝马";
		Engine4 engine4=car4.getEngine4();
		engine4.run();

	}

}
