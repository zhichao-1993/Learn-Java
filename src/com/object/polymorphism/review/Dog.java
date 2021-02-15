package com.object.polymorphism.review;

public class Dog extends Pet{
	@Override
	public void eat() {
		System.out.println("狗狗在吃东西");
	}

	public static void main(String[] args) {
		Pet pet=new Dog();
		pet.eat();

	}

}
