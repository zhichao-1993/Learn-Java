package com.object.innerClass;

public class Car5 {
	String name;
	
	public void run(String name) {
		System.out.println(name+"在跑");
	}
	private class Engine{
		private String name="引擎";
		private void run() {
			System.out.println("内部类的name属性"+name);
			System.out.println("外部类的name属性"+Car5.this.name);
			Car5.this.run(Car5.this.name);
		}
		
	}
	public Engine getEngine() {
		return new Engine();
	}

	public static void main(String[] args) {
		Car5 car5=new Car5();
		car5.name="大奔";
		Engine engine=car5.getEngine();
		engine.run();

	}

}
