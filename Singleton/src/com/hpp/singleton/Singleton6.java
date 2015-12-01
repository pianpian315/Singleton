package com.hpp.singleton;

/*
 * 枚举单例, 线程安全
 * */
public enum Singleton6 {
	INSTANCE;
	
	public void doSomething() {
		System.out.println("do sth6.");
	}
}
