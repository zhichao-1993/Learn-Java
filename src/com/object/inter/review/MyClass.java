package com.object.inter.review;

public class MyClass implements MyFace3{
	@Override
	public void method3() {
		System.out.println("重写MyFace3中的方法");
	}
	@Override
	public void method2() {
		System.out.println("重写MyFace3的父类MyFace2中的方法");
	}
	@Override
	public void method1() {
		System.out.println("重写MyFace2的父类MyFace1中的方法");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
