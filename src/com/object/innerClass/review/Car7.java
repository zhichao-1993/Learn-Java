package com.object.innerClass.review;

public class Car7 {
	public void run() {
		class Engine7{
			public void run() {
				System.out.println("发动机启动了");
				System.out.println("写在方法里的内部类");
			}
		}
		Engine7 engine7=new Engine7();
		engine7.run();
	}

	public static void main(String[] args) {
		Car7 car7=new Car7();
		car7.run();

	}

}
