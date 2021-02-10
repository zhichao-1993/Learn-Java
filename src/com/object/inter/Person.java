package com.object.inter;



public interface Person {
	final String NAME = "123456";
	void walk();
	void run();
	default void eat() {
		System.out.println("吃东西");
	}
	static void sayHello() {
		System.out.println("Hello,Java");
	}

}
