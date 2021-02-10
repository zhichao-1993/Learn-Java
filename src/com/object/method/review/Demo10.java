package com.object.method.review;

public class Demo10 {
	//有参数有返回值
	//两个参数，一个可变参数
	//判断某个值是否在数组中
	public boolean search(int element,int...n) {
		boolean result=false;
		for(int i:n) {
			if(i==element) {
				result=true;
				break;
			}
		}
		return result;
	}
	public static void  main(String[] args) {
		Demo10 demo10 = new Demo10();
		int element=2;
		int[] n= {1,2,3,4,5};
		boolean result=demo10.search(element, n);
		System.out.println(result);
	}
}
