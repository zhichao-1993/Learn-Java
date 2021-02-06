package com.object.method;

public class MethodDemo5 {
	//有参有返回值，参数是数组
	public boolean contains(int[] arr,int element) {
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
		MethodDemo5 methodDemo5=new MethodDemo5();
		int[] arr= {1,2,3,4,5};
		int element=5;
		boolean contains=methodDemo5.contains(arr, element);
		if(contains) {
			System.out.println("数组包含5");
		}else {
			System.out.println("数组不包含5");
		}
	}

}
