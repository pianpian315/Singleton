package com.hpp.singleton;

/*
 * 双重检查锁定:
 * 在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，
 * 这样也是线程安全的，同时避免了每次都同步的性能损耗.
 * */
public class Singleton2 {
	private volatile static Singleton2 instance = null;
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		if (instance == null) {
			synchronized(Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
			}
		}
		
		return instance;
	}
	
	public void doSomething() {
		System.out.println("do sth2.");
	}
}
