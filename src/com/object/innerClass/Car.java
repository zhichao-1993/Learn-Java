package com.object.innerClass;

public class Car {
	//内部类
	private String Name="123";
	private  class Engine{
		public void run() {
			System.out.println("发动机启动");
		}
	}
	
	public Engine getEngine() {
		return new Engine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法一
		Car car=new Car();
		Engine engine=car.new Engine();
		engine.run();
		//方法二
		Engine engine2=new Car().new Engine();
		engine2.run();
		//方法三，写一个方法得到实例的内部类
		Car car2=new Car();
		Engine engine3=car2.getEngine();
		engine3.run();
	}

}
