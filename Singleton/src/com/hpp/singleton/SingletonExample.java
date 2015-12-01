package com.hpp.singleton;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton1.getInstance().doSomething();
		Singleton2.getInstance().doSomething();
		Singleton3.getInstance().doSomething();
		Singleton4.getInstance().doSomething();
		Singleton5.getInstance().doSomething();
		Singleton6.INSTANCE.doSomething();
		SingletonChild.getInstance().doSomething();
	}

}
