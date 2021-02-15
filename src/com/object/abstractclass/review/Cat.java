package com.object.abstractclass.review;

public class Cat extends Pet{
	@Override
	public void eat() {
		System.out.println("猫猫在吃东西");
	}

	public static void main(String[] args) {
		Pet pet=new Cat();
		pet.eat();
		Cat cat=(Cat)pet;
		cat.eat();

	}

}
