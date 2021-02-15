package com.object.innerClass.review;

public abstract  class Transport {
	public void run() {
		System.out.println("交通工具在跑");
	}

	public static void main(String[] args) {
		Transport car1=new Transport() {
			@Override
			public void run() {
				System.out.println("汽车在跑");
			}
		};
		car1.run();
		Transport airPlane1=new Transport() {
			@Override
			public void run() {
				System.out.println("飞机起飞了");
			}
		};
		airPlane1.run();
	}

}
