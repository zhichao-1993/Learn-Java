package com.object.method;

public class Car {
	//有参无返回值，基本参数的传值
	public void spe(int speed) {
		System.out.println("加速前speed为："+speed);
		speed++;
		System.out.println("加速后speed为："+speed);
	}
	//方法里参数的值不会影响主方法里的参数
	public static void main(String[] arg) {
		Car car =new Car();
		int speed = 10;
		car.spe(speed);
		System.out.println("调用方法后，speed主方法里的speed为:"+speed);
	}
}
