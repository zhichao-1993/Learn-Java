package com.object.method.review2;



public class D10 {
	//有两个参数，可变参数放在最后
	public void var(int element,int...n) {
		boolean result=false;
		for(int i:n) {
			if(i==element) {
				result=true;
				System.out.println(element+"在里面");
				break;
			}
		}
		System.out.println(element+"不在里面");
	}

	public static void main(String[] args) {
		D10 d10=new D10();
		int element = 8;
		int[] n= {1,2,3,4,5,6};
		d10.var(element, n);
	}

}
