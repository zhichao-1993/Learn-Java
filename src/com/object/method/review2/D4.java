package com.object.method.review2;

public class D4 {
	//有参数有返回值
	//求1到n的平方和
	public int getSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}

	public static void main(String[] args) {
		D4 d4=new D4();
		int n=10;
		int sum=d4.getSum(n);
		System.out.println(sum);

	}

}
