package com.object.polymorphism.review;



public class Pet {
	public void eat() {
		System.out.println("宠物在吃东西");
	}

	public static void main(String[] args) {
		Pet pet=new Pet();
		Pet dog=new Dog();
		Pet cat=new Cat();
		pet.eat();
		dog.eat();
		cat.eat();
		Cat cat2=new Cat();
		Object o=cat2;
		
		
	}

}
