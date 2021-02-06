package com.object.method;

public class Variable {
	//可变参数
	public void sum(int... n) {
		int sum = 0;
		for(int i:n) {
			sum+=i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable variable=new Variable();
		variable.sum(1);
		variable.sum(1,2,3);
		variable.sum(1,2,3,4);
	}

}
