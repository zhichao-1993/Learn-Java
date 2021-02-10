package com.object.inter;

public class Players implements MyFace3{
	@Override
	public void method1() {
		System.out.println("重写MyFace3的父类方法");
	}
	@Override
	public void method2() {
		System.out.println("重写MyFace3的父类方法");
	}
	@Override
	public void method3() {
		System.out.println("重写子类MyFace3的方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
