package com.object.innerClass;

public class SubClass {	
	public class innerClass1 extends SuperClass1{
		@Override
		public void method1() {
			super.method1();
		}
	}
	
	public class innerClass2 extends SuperClass2{
		@Override
		public void method2() {
			super.method2();
		}
		
	}

	public static void main(String[] args) {
		innerClass1 inClass1=new SubClass().new innerClass1();
		innerClass2 inClass2=new SubClass().new innerClass2();
		inClass1.method1();
		inClass2.method2();

	}

}
