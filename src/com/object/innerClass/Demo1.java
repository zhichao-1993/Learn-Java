package com.object.innerClass;

public class Demo1 extends One{
	@Override
	public void test() {
		System.out.println("在外部（子）类中重写了One中的test方法");
	}
	
	
	public class InnerClass implements Two{
		@Override
		public void test() {
			System.out.println("在内部类中实现了Two中的test方法");
		}
	}
	
	

	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		demo1.test();
		InnerClass innerClass=demo1.new InnerClass();
		innerClass.test();

	}

}
