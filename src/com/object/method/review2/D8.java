package com.object.method.review2;

public class D8 {
	public void replaceFirstPlayer(String[] players,String play) {
		System.out.println("替换球员");
		players[0]=play;
	}

	public static void main(String[] args) {
		D8 d8 =new D8();
		String[] player= {"哈登","科比","詹姆斯"};
		String play="乔丹";
		d8.replaceFirstPlayer(player, play);
		for(String i:player) {
			System.out.println(i);
		}

	}

}
