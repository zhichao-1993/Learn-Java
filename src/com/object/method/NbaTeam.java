package com.object.method;

public class NbaTeam {
	public void replaceFirstPlayers(String[] players,String player) {
		System.out.println("将第一个球员替换");
		players[0]=player;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NbaTeam nbaTeam=new NbaTeam();
		String[] players= {"科比","杜兰特","乔丹"};
		String player="哈登";
		System.out.println("球队球员有：");
		for(String i:players) {
			System.out.println(i);
		}
		nbaTeam.replaceFirstPlayers(players, player);
		System.out.println("球队球员有：");
		for(String i:players) {
			System.out.println(i);
		}

	}

}
