package com.object.innerClass.review1;

public class Class1 {
	class InnerClass1 extends C1{
		@Override
		public void method1() {
			super.method1();
			System.out.println("内部类继承后，调用父类的方法，super.方法名");
		}
	}
	class InnerClass2 extends C2{
		@Override
		public void method2() {
			super.method2();
			System.out.println("内部类继承后，调用父类的方法，super.方法名");
		}
	}

	public static void main(String[] args) {
		Class1 class1=new Class1();
		InnerClass1 innerClass1=class1.new InnerClass1();
		innerClass1.method1();
		InnerClass2 innerClass2=class1.new InnerClass2();
		innerClass2.method2();

	}

}
