package com.object.method.review;

public class MethodDemo5 {
	//有参有返回值
	//求1到n的平方和
	public int demo5(int n) {
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum+=i*i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo5 methodDemo5=new MethodDemo5();
		int n = 5;
		int sum=methodDemo5.demo5(n);
		System.out.println(sum);

	}

}
