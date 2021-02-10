package com.object.method.review;



public class Demo9 {
	//可变参数int...
	public void var(int...n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9 demo9=new Demo9();
		demo9.var(1);
		demo9.var(1,2);
		demo9.var(1,2,3);

	}

}
