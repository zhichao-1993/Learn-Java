package com.object.inter;

public class B implements A1,A2{
	@Override
	public void method() {
		System.out.println("重写A1,A2中的method方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b =new B();
		b.method();

	}

}
