package com.object.inter;

public class MyClass implements Myface2{
	@Override
	public void method1() {
		System.out.println("重写Myface2父类的方法");
	}
	@Override
	public void method2() {
		System.out.println("重写子类Myface1中的方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
