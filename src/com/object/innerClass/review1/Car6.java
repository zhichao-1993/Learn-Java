package com.object.innerClass.review1;

public class Car6 {
	public void run() {
		class Engine{
			public void run() {
				System.out.println("发动机启动了");
			}
		}
		Engine engine =new Engine();
		engine.run();
	}

	public static void main(String[] args) {
		Car6 car6=new Car6();
		car6.run();

	}

}
