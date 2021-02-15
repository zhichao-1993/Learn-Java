package com.object.inter.review;

public interface Person1 {
	void run();
	default void eat() {
		System.out.println("Person1接口的默认方法eat()");
	}

}
