package com.object.inheritance;

public class Pet {
	private String name;
	private int age;
	protected String birthday;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	//父类方法
	public void eat() {
		System.out.println(this.getName()+"在吃东西");
	}
	public void call() {
		System.out.println(this.getName()+"在叫");
	}
	
	
	//父类的构造方法
	public Pet() {
		
	}
	public Pet(String name) {
		this.name=name;
		System.out.println("宠物被创建了实例，名字叫："+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
