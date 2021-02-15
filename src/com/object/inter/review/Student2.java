package com.object.inter.review;

public class Student2 implements Person2{
	@Override 
	public void walk() {
		
		System.out.println("重写Person2中walk()方法");
		Person2.sayHello();
		System.out.println("接口名.方法的方式调用Person2接口中静态方法");
	}

}
