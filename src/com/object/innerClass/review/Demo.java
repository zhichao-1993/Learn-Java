package com.object.innerClass.review;

public class Demo extends One{
	@Override
	public void test() {
		System.out.println("在外部类中重写父类的test同名方法");
	}
	class InnerClass implements Two{
		@Override
		public void test() {
			System.out.println("在内部类中重写接口中test同名方法");
		}
	}

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.test();
		InnerClass innerClass =new Demo().new InnerClass();
		innerClass.test();

	}

}
