package com.object.innerClass.review1;

public class Car3 {
	String name;
	public void run(String name) {
		System.out.println(name+"启动了");
	}
	private class Engine3{
		private String name="引擎";
		public void run() {
			System.out.println(name+"发动了");
			System.out.println("内部和外部有同名的属性的时候，在内部里先使用内部类的属性");
			System.out.println(Car3.this.name+"发动机启动了");
			System.out.println("内部和外部有同名的属性的时候，在内部里要使用外部类属性，类名.this.属性");
			Car3.this.run(Car3.this.name);
			System.out.println("内部和外部有同名的方法的时候，在内部里要使用外部类的方法，类名.this.方法");
		}
	}
	public Engine3 getEngine3() {
		return new Engine3();
	}
	

	public static void main(String[] args) {
		Car3 car3 =new Car3();
		car3.name="奔奔";
		Engine3 engine3=car3.getEngine3();
		engine3.run();

	}

}
