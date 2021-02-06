package com.object.method;

public class Search {
	//有两个参数的时候，可变参数一定放最后面
	//某个元素是否在可变参数里
	public void sear(int element,int... elements) {
		boolean existed=false;
		for(int i:elements) {
			if(i==element) {
				existed=true;
				break;
			}
		}
		if(existed) {
			System.out.println("元素在里面");
		}else {
			System.out.println("元素不在里面");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search search=new Search();
		int element=1;
		int[] elements= {1,2,3,4,5};
		search.sear(element, elements);
		search.sear(8, 5,8,7,9);

	}

}
