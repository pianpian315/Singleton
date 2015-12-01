package com.hpp.singleton;

/*
 * 饿汉式单例类.在类初始化时，已经自行实例化
 * */
public class Singleton5 {
	private static final Singleton5 instance = new Singleton5();
	
	public static Singleton5 getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println("do sth5.");
	}
}
