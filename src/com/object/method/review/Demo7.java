package com.object.method.review;

public class Demo7 {
	//参数是基本类型，方法和main方法里的参数是没有关系的
	public void demo7(int speed) {
		System.out.println("加速前"+speed);
		speed++;
		System.out.println("加速后"+speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 demo7=new Demo7();
		int speed=50;
		demo7.demo7(speed);

	}

}
