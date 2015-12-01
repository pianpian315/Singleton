package com.hpp.singleton;

/*
 * 静态内部类:
 * 在第一次加载Holder时初始化一次instance对象, 保证唯一性, 也延迟了单例的实例化.
 * */
public class Singleton4 {
	private static class Holder {
		private static Singleton4 instance = new Singleton4();
	}
	
	public static Singleton4 getInstance() {
		return Holder.instance;
	}
	
	public void doSomething() {
		System.out.println("do sth4.");
	}
}
