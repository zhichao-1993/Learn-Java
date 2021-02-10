package com.object.polymorphism;

public class Dog extends Pet{
	//重写父类的eat方法
	public void eat() {
		System.out.println("狗狗在吃东西");
	}
	public void run() {
		System.out.println("狗狗在跑步");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//向下转型
		Pet dog=new Dog();
		Dog dog2=(Dog)dog;
		dog2.run();

	}

}
