package com.object.innerClass;



public class Car3 {
	
	
	private class Engine {
		private void run() {
			System.out.println("发动机启动");
		}
	}

	public Engine getEngine() {
		return new Engine();
	}
	public static void main(String[] args) {
		//1
		Engine engine=new Car3().new Engine();
		engine.run();
		//2
		Car3 car=new Car3();
		Engine engine2=car.new Engine();
		engine2.run();
		//3
		Car3 car2=new Car3();
		Engine engine3=car2.getEngine();
		engine3.run();

	}

}
