package com.object.classesAndObjects;

public class ImoocStudent {
	//类的属性
	String nickname;
	
	String position;
	
	String sex;
	
	String city;
	
	//类的方法
	public void study() {
		System.out.println("学习课程");
		
	}
	public void com() {
		System.out.println("发表评论");
	}
	
	
	public void art() {
		System.out.println("发朋友圈");
	}
	
	//类的构造方法无参
	public ImoocStudent() {
		System.out.println("无参的构造方法执行了");
	}
	
	//类的构造方法有参
	public ImoocStudent(String StudentNickname,String StudentPositon) {
		nickname=StudentNickname;
		position=StudentPositon;
	}
	
	public ImoocStudent(String nickname,String position,String sex,String city) {
		this.nickname=nickname;
		this.position=position;
		this.sex=sex;
		this.city=city;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImoocStudent imoocStudent=new ImoocStudent();
		imoocStudent.nickname="xiaoming";
		imoocStudent.position="java工程师";
		imoocStudent.city="上海";
		imoocStudent.sex="男";
		System.out.println("昵称："+imoocStudent.nickname);
		System.out.println("职位："+imoocStudent.position);
		System.out.println("城市："+imoocStudent.city);
		System.out.println("性别："+imoocStudent.sex);
		imoocStudent.study();
		imoocStudent.com();
		imoocStudent.art();
		ImoocStudent imoocStudent2=new ImoocStudent("小黑", "python工程师");
		System.out.println("昵称："+imoocStudent2.nickname);
		System.out.println("职位："+imoocStudent2.position);
		ImoocStudent imoocStudent3=new ImoocStudent("老二","污水厂厂长","上海","男");
		String[] hu= {imoocStudent3.nickname,imoocStudent3.position,imoocStudent3.city,imoocStudent3.sex};
		System.out.println("昵称:"+hu[0]);
		System.out.println("职位:"+hu[1]);
		System.out.println("城市:"+hu[2]);
		System.out.println("性别:"+hu[3]);
	}

}
