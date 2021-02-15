package com.object.innerClass.review;

public class Car5 {
	static class Engine5{
		public void run() {
			System.out.println("静态内部类的run方法");
			System.out.println("发动机启动了");
		}
	}

	public static void main(String[] args) {
		Engine5 engine5=new Engine5();
		engine5.run();
		System.out.println("静态内部类和非静态内部类的实例是不一样的，不需要通过外部类");

	}

}
