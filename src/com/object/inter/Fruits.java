package com.object.inter;



public class Fruits implements TropicalFruit{
	@Override
	public void banana() {
		System.out.println("香蕉");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fruits=new Fruits();
		fruits.banana();
		TropicalFruit.orange();
		

	}

}
