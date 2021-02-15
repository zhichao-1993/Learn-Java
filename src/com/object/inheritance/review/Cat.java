package com.object.inheritance.review;


//final在类和方法前不能被继承
public final class Cat extends Pet{
	public void sleep() {
		System.out.println(this.getName()+"在睡觉");
	}

	@Override
	public void call() {
		System.out.println(this.getName()+"喵喵在叫");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("猫猫饭量很大");
	}
	
	public  Cat() {
		System.out.println("宠物的生日："+super.birthday);
	}
	public  Cat(String name) {
		super(name);
		System.out.println("猫猫被创建了");
	}

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.setName("小头");
		cat.setAge(2);
		System.out.println(cat.getName()+"今年"+cat.getAge());
		cat.sleep();
		cat.call();
		Cat cat2=new Cat("邦");
		cat.eat();
		
		
		
		

	}

}
