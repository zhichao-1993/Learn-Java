package com.object.inter;

public interface People {
	void sex();
	default void nationality() {
		System.out.println("中国");
	}

}
