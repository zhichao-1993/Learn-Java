package com.object.method.review;

public class Demo8 {
	//参数是引用类型的，改变方法里的参数或改变main方法里参数都会影响
	//有参数无返回值
	public void replaceFirstPlayer(String[] players,String playerName) {
		System.out.println("替换第一个球员");
		players[0]=playerName;
	}

	public static void main(String[] args) {
		Demo8 demo8=new Demo8();
		String[] player= {"科比","威少","沃尔"};
		String playerName="詹姆斯";
		System.out.println("球员有");
		for(String p:player) {
			System.out.println(p);
		}
		demo8.replaceFirstPlayer(player, playerName);
		System.out.println("球员有");
		for(String p:player) {
			System.out.println(p);
		}
		
		
		

	}

}
