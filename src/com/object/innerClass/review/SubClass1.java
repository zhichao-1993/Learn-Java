package com.object.innerClass.review;

public class SubClass1 {
	class InnerClass1 extends sclass1{
		@Override
		public void method1() {
			super.method1();
		}
	}
	class InnerClass2 extends sclass2{
		@Override
		public void method2() {
			super.method2();
		}
	}

	
	public static void main(String[] args) {
		SubClass1 subClass1=new SubClass1();
		InnerClass1 innerClass1=subClass1.new InnerClass1();
		innerClass1.method1();
		InnerClass2 innerClass2=subClass1.new InnerClass2();
		innerClass2.method2();
		

	}

}
