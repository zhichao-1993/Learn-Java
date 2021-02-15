package com.object.innerClass.review1;

public abstract class Transport {
	public void run() {
		System.out.println("交通工具在跑");
	}

	public static void main(String[] args) {
		Transport car=new Transport() {
			@Override
			public void run() {
				System.out.println("汽车在跑");
				System.out.println("匿名内部类");
			}
		};
		car.run();
		Transport airPlane=new Transport() {
			@Override
			public void run() {
				System.out.println("飞机在飞");
				System.out.println("匿名内部类");
			}
		};
		airPlane.run();
	}

}
