package com.object.method.review;



public class Demo6 {
	//有参数有返回值，参数是数组
	public boolean demo6(int[] arr,int element) {
		boolean result=false;
		for(int a:arr) {
			if(a==element) {
				result=true;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 demo6=new Demo6();
		int[] arr= {1,2,3,4,5};
		int element=1;
		boolean result=demo6.demo6(arr, element);
		System.out.println(result);
		

	}

}
