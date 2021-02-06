package com.object.inheritance;

public class Dog extends Pet{
	//在子类构造方法中调用父类构造方法


	//在子类构造方法中调用父类构造方法
	public Dog(String name) {
		super(name);
		System.out.println("小狗被创建了");
	}

	public Dog() {
		System.out.println("宠物生日："+super.birthday);
	}

	private float weight;
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
	public void run() {
		System.out.println("胖成了"+this.getWeight()+"斤的狗在跑");
	}
	
	//重写父类方法
	@Override
	public void call() {
	
		System.out.println(this.getName()+"在汪汪汪的叫");
	}
	//重写父类的方法，并用super，调用父类的方法
	@Override
	public void eat() {
		super.eat();
		System.out.println("小狗很能吃");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.setAge(3);
		dog.setName("大头");
		System.out.println("名字："+dog.getName());
		System.out.println("年纪："+dog.getAge());
		dog.eat();
		dog.call();
		dog.setWeight(30);
		System.out.println("体重："+dog.getWeight());
		dog.run();
		dog.call();
		Dog dog2=new Dog("小小");

	}
}
