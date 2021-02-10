package com.object.method.review;

public class MethodDemo4 {
	//求长方形的面积
	//有参数无返回值
	public void printArea(float width,float height) {
		float area=width*height;
		System.out.printf("%.2f\n",area);
		
	}

	public static void main(String[] args) {
		MethodDemo4 methodDemo4=new MethodDemo4();
		float width=2.2f;
		float height=3.3f;
		methodDemo4.printArea(width, height);

	}

}
