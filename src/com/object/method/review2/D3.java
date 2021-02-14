package com.object.method.review2;

public class D3 {
	//求长方形的面积
	public void printArea(float width,float height) {
		float area=width*height;
		System.out.println(area);
	}
	public static void main(String[] args) {
		D3 d3=new D3();
		float width=2.6f;
		float height=2.7f;
		d3.printArea(width, height);		
	}
}
