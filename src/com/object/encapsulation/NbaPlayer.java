package com.object.encapsulation;

public class NbaPlayer {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;		
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<0) {
			this.age=0;
		}else {
			this.age=age;
		}
	}
	//无参构造方法
	public NbaPlayer() {
		// TODO Auto-generated constructor stub
	}
	//单参构造方法
	public NbaPlayer(String name) {
		this.name=name;
	}
	
	//全参构造方法
	public NbaPlayer(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NbaPlayer nbaPlayer=new NbaPlayer();
		nbaPlayer.setAge(19);
		int age=nbaPlayer.getAge();//通过get方法，获取类的属性
		System.out.println(age);
		nbaPlayer.setName("胖虎");//通过set方法，改变类的属性
		String name=nbaPlayer.getName();//通过get方法，获取类的属性
		System.out.println(name);
		NbaPlayer nbaPlayer2=new NbaPlayer("詹姆斯");//使用类的构造方法，直接传入参数
		nbaPlayer2.setName("字母歌");//通过set方法，改变类的属性
		System.out.println(nbaPlayer2.getName());//通过get方法，获取类的属性
		NbaPlayer nbaPlayer3=new NbaPlayer("科比", 35);//使用类的构造方法，直接传入参数
		nbaPlayer3.setName("哈登");//通过set方法，改变类的属性
		nbaPlayer3.setAge(30);//通过set方法，改变类的属性
		System.out.println(nbaPlayer3.getName());
		System.out.println(nbaPlayer3.getAge());
		

	}

}
