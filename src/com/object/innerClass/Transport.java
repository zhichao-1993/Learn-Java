package com.object.innerClass;

public abstract class Transport {
	public void run() {
		System.out.println("交通工具的run()方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport car=new Transport() {
			@Override
			public void run() {
				System.out.println("汽车在跑");
			}
		};
		car.run();
		
		Transport airPlan=new Transport() {
			@Override
			public void run() {
				System.out.println("飞机在飞");
			}
		};
		airPlan.run();

	}

}
