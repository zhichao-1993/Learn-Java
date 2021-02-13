package com.object.innerClass;

public class Car7 {
	String brand="宝马";
	static String name="外部类的静态属性name";
	
	
	
	public static class Engine{
		public void run() {
			System.out.println(name);
			Car7 car7=new Car7();
			System.out.println(car7.brand);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine=new Engine();
		engine.run();

	}

}
