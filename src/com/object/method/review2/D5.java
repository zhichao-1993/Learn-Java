package com.object.method.review2;

public class D5 {
	//有参有返回值
	public boolean search(int[] arr,int element) {
		boolean result=false;
		for(int i:arr) {
			if(i==element) {
				result=true;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		D5 d5=new D5();
		int[] arr= {1,2,3,4,5};
		int element=4;
		boolean result=d5.search(arr, element);
		System.out.println(result);
		

	}

}
