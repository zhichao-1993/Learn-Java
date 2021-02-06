package com.object.method;

public class MethodDemo4 {
	//有参数有返回值
	public int getSumOfquares(int n) {
		int sum = 0;
		for(int i=1;i<=5;i++) {
			sum+=i*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo4 methodDemo4= new MethodDemo4();
		int n = 5;
		int sumOfquares=methodDemo4.getSumOfquares(5);
		System.out.println(sumOfquares);

	}

}
