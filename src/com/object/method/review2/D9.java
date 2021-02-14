package com.object.method.review2;

public class D9 {
	//可变参数
	public void getSum(int...n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		D9 d9=new D9();
		d9.getSum(1,2);

	}

}
