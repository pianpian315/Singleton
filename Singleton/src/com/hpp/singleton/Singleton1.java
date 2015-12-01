package com.hpp.singleton;

/*
 * 在getInstance方法上加同步：
 * 在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能
 * 因为只需要第一次调用单例的时候保持同步，避免创建多个单例
 * */
public class Singleton1 {
	private static Singleton1 instance = null;
	
	private Singleton1() {}
	
	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		
		return instance;
	}
	
	public void doSomething() {
		System.out.println("do sth1.");
	}
}
