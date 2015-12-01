package com.hpp.singleton;

public class SingletonChild extends Singleton7 {
	public SingletonChild() {}
	
	static public SingletonChild getInstance() {
        return (SingletonChild)Singleton7.getInstance("com.hpp.singleton.SingletonChild");
    }
	
	public void doSomething() {
		System.out.println("do sth7.");
	}
}
