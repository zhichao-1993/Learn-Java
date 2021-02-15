package com.object.polymorphism.review;

public class Cat extends Pet{
	@Override
	public void eat() {
		System.out.println("猫猫在吃东西");
	}
	
	public void run() {
		System.out.println("宠物在跑步");
	}

	public static void main(String[] args) {
		Pet pet=new Cat();
		if(pet instanceof Cat) {
			Cat cat=(Cat)pet;
		}
		
		

	}

}
