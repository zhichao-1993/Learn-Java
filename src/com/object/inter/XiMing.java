package com.object.inter;

public class XiMing implements People{
	@Override
	public void sex() {
		System.out.println("男生");
	}
	@Override
	public void nationality() {
		People.super.nationality();
		System.out.println("上海");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XiMing xiMing=new XiMing();
		xiMing.sex();
		xiMing.nationality();

	}

}
