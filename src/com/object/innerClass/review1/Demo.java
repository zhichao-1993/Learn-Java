package com.object.innerClass.review1;

public class Demo extends One{
	@Override
	public void test() {
		System.out.println("重写父类One中的test方法");
	}
	class InnerClass implements Two{
		@Override
		public void test() {
			System.out.println("重写接口中的test方法");
		}
	}

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.test();
		InnerClass innerClass=demo.new InnerClass();
		innerClass.test();

	}

}
