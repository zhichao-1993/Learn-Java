package com.object.polymorphism;



public class Pet {
	//父类eat方法
	public void eat() {
		System.out.println("宠物在吃东西");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用eat方法
		Pet pet=new Pet();
		pet.eat();
		//向上转型，子类对象指向父类
		Pet cat=new Cat();
		cat.eat();
		Pet dog=new Dog();
		dog.eat();
		/*试错：父转子
		Pet pet2=new Pet();
		Cat cat2=(Cat)pet2;
		cat2.eat();*/
		/*试错：兄弟转兄弟
		Dog dog2=new Dog();
		Cat cat2=(Cat)dog2;*/
		
		//instanceof运算符
		Pet pet2=new Cat();
		if(pet2 instanceof Cat) {
			Cat cat2=(Cat)pet2;
			System.out.println("向下转型成功");
		}
		
		

	}

}
