package com.object.method.review2;

public class D11 {
	//重载；方法名、返回类型相同，参数不同，方法的重载
	public void study() {
		System.out.println("是好学生");
	}
	public void study(String name) {
		System.out.println(name+"是好学生");
	}
	public void study(String name,int age) {
		System.out.println(name+"今年"+age+"岁");
	}

	public static void main(String[] args) {
		D11 d11=new D11();
		d11.study();
		d11.study("老二");
		d11.study("老二", 28);

	}

}
