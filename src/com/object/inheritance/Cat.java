package com.object.inheritance;

public class Cat extends Pet{
	//创建子类的无构造方法
	public Cat() {
		System.out.println("宠物的生日："+super.birthday);
	}
	public Cat(String name) {
		super(name);
		System.out.println("小猫被创建了");
	}
	
	
	public void sleep() {
		System.out.println(this.getName()+"在睡大觉");
	}
	@Override
	public void call() {
		System.out.println(this.getName()+"在喵喵喵的叫");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("小猫饭量很小");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		cat.setAge(2);
		cat.setName("小头");
		System.out.println("年纪："+cat.getAge());
		System.out.println("名字："+cat.getName());
		cat.sleep();
		cat.call();
		Cat cat2=new Cat("张大大");
		cat.eat();
		
	}

}
