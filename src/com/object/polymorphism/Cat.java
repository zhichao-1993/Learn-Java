package com.object.polymorphism;

public class Cat extends Pet{
	//重写父类eat方法
	public void eat() {
		System.out.println("猫猫在吃东西");
	}
	
	//
	public void run() {
		System.out.println("猫猫跑步");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//向下转型，父向子
		Pet cat=new Cat();
		Cat cat2=(Cat)cat;
		cat2.run();

	}

}
