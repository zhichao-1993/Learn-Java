package com.object.method;

import java.io.PrintStream;

public class MethodDemo1 {
    //如何在类里调用方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo1 methodDemo1 = new MethodDemo1();
		methodDemo1.printText();

	}
	//无参无返回值的方法案例	
	public void printText() {
		System.out.println("java");
		System.out.println("learnJava");
	}
	

}
