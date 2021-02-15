package com.object.inheritance.review;

import com.object.innerClass.SuperClass1;

public class Dog extends Pet{
	private float weight;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
	public void run() {
		System.out.println("胖成"+this.getWeight()+"斤的狗在跑");
	}
	@Override
	public void call() {
		System.out.println(this.getName()+"汪汪在叫");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("狗狗饭量很大");
	}
	public  Dog() {
		System.out.println(super.birthday);
	}
	
	public  Dog(String name) {
		super(name);
		System.out.println("狗狗被创建了");
	}

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("大头");
		dog.setAge(3);
		dog.setWeight(20);
		dog.call();
		Dog dog2=new Dog("小小");
		dog.eat();
		

	}

}
