package com.object.innerClass.review;

public class Car {
	private class Engine{
		public void run() {
			System.out.println("发动机启动了");
		}
	}
	public Engine getEngine() {
		return new Engine();
	}

	public static void main(String[] args) {
		Engine engine=new Car().new Engine();
		engine.run();
		Car car=new Car();
		Engine engine2=car.new Engine();
		engine2.run();
		
		Car car2=new Car();
		Engine engine3=car2.getEngine();
		engine3.run();

	}

}
