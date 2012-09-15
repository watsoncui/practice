package com.watsoncui.nkcms.struts2.threadlocal;

public class Counter {
	
//Create a static "ThreadLocal" variable which should be visited through get method.
	private static ThreadLocal<Integer> counterContext = new ThreadLocal<Integer>() {
		protected synchronized Integer initialValue() {
			return 10;
		}
	};
	
//the get method used to visit value in ThreadLocal
	public static Integer get() {
		return counterContext.get();
	}
	
//the set method used to set value to ThreadLocal
	public static void set(Integer value) {
		counterContext.set(value);
	}
	
//Encapsulate business logic. Manipulate the variable in the ThreadLocal
	public static Integer getNextCounter() {
		counterContext.set(counterContext.get() + 1);
		return counterContext.get();
	}
}
