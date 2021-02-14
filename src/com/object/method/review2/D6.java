package com.object.method.review2;

public class D6 {
	public void getSpeed(int speed) {
		System.out.println("加速前speed:"+speed);
		speed++;
		System.out.println("加速后speed:"+speed);
	}

	public static void main(String[] args) {
		D6 d6=new D6();
		d6.getSpeed(5);

	}

}
