package com.object.innerClass;

public class Car1 {
	private class Engine{
		private String Name="123456";
		public void run() {
			System.out.println("发动机启动了");
		}
	}
	
	public Engine getEngine() {
		return new Engine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一
		Engine engine =new Car1().new Engine();
		engine.run();
		//二
		Car1 car1=new Car1();
		Engine engine2=car1.new Engine();
		engine2.run();
		//三
		Car1 car2=new Car1();
		Engine engine3=car2.getEngine();
		engine3.run();		               
	}

}
