package com.object.classesAndObjects;

public class ImoocStudent1 {
	String nickname;
	String position;
	String sex;
	String city;
	public void study() {
		System.out.println("在学习");
	}
	public void com() {
		System.out.println("发表论文");
	}
	public void art() {
		System.out.println("发朋友圈");
	}
	
	public void ImoocStudent() {
		System.out.println("学生在学习");
	}
	public void ImoocStudent(String nickname) {
		this.nickname=nickname;
		//System.out.println(nickname+"在学习");
	}
	public void ImoocStudent(String nickname,String position) {
		this.nickname=nickname;
		this.position=position;
		//System.out.println(nickname+"担任"+position);
	}
	
	
	

	public static void main(String[] args) {
		ImoocStudent1 imoocStudent1=new ImoocStudent1();
		imoocStudent1.nickname="老二";
		imoocStudent1.position="厂长";
		imoocStudent1.sex="男";
		imoocStudent1.city="上海";
		System.out.println(imoocStudent1.nickname);
		System.out.println(imoocStudent1.position);
		System.out.println(imoocStudent1.sex);
		System.out.println(imoocStudent1.city);
		imoocStudent1.ImoocStudent("小明");
		System.out.println(imoocStudent1.nickname);
		imoocStudent1.ImoocStudent("小红", "工程师");
		System.out.println(imoocStudent1.nickname+"是"+imoocStudent1.position);
		

	}

}
