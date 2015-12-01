package com.hpp.singleton;

import java.util.HashMap;
import java.util.Map;

/*
 * 为了克服懒汉式和饿汉式不能继承而设计的
 * */
public class Singleton7 {
	private static Map<String, Singleton7> map = new HashMap<String, Singleton7>();
	
	static {
		map.put(Singleton7.class.getName(), new Singleton7());
	}
	
	protected Singleton7() {}
	
	public static Singleton7 getInstance(String name) {
		if (name == null) {
			throw new IllegalArgumentException(name);
		}
		
		if (map.get(name) == null) {
			try {
				map.put(name, (Singleton7)Class.forName(name).newInstance());
			} catch (InstantiationException e) {  
                e.printStackTrace();  
            } catch (IllegalAccessException e) {  
                e.printStackTrace();  
            } catch (ClassNotFoundException e) {  
                e.printStackTrace();  
            }  
		}
		
		return map.get(name);
	}
}
