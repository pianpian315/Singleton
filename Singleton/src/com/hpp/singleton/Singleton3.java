package com.hpp.singleton;

/*
 * 使用ThreadLocal修复双重检测:
 * 借助于ThreadLocal，将临界资源（需要同步的资源）线程局部化
 * */
public class Singleton3 {
	private static Singleton3 instance = null;
	
	private static final ThreadLocal<Singleton3> threadLocal = new ThreadLocal<Singleton3>();
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		if (threadLocal.get() == null) {
			synchronized(Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
			threadLocal.set(instance);
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("do sth3.");
	}
}
