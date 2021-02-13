package com.object.innerClass;

public class Car4 {
	String name;
	
	private class Engine{
		private void run() {
			System.out.println(name+"的发动机启动");
		}
	}
	public Engine getEngine() {
		return new Engine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 car4=new Car4();
		car4.name="大奥迪";
		Engine engine=car4.getEngine();
		engine.run();

	}

}
