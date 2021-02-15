package com.object.inheritance.review;

public class Pet {
	private String nameString;
	private int age;
	//final在变量前不能被重新赋值
	protected final String birthday="2019.08.16";
	public String getName() {
		return nameString;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.nameString=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void eat() {
		System.out.println("宠物在吃东西");
	}
	public void call() {
		System.out.println("宠物在叫");
	}
	public  Pet() {
		System.out.println("无参构造方法");
	}
	public  Pet(String name) {
		System.out.println("宠物被创建了，名字叫："+name);
	}

	public static void main(String[] args) {
		Pet pet=new Pet();
		

	}

}
