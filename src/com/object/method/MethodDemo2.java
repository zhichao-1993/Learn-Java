package com.object.method;

public class MethodDemo2 {
	//无参有返回值
	public String getHelloStr() {
		String str = "HelloStr";
		return str;
	}
	//创建对象，通过对象调用方法，声明变量装返回值，输出
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo2 methodDemo2=new MethodDemo2();
		String str = methodDemo2.getHelloStr();
		System.out.println(str);

	}

}
