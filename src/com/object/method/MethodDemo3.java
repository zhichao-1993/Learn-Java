package com.object.method;

public class MethodDemo3 {
	//有参数无返回值的方法，可以打印输出
	public void printArea(float width,float height) {
		float area = width*height;
		System.out.printf("%.2f\n", area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo3 methodDemo3=new MethodDemo3();
		float width = 3.1f;
		float heitht = 4.2f;
		methodDemo3.printArea(width, heitht);

	}

}
