package com.watsoncui.nkcms.struts2.threadlocal;

//
//Beginning class
//A test of ThreadLocal
//from chapter 4 of <Struts2 Internals>
//
//The core is Counter.java
//

public class Test {
	public static void main(String[] args) throws Exception {
		ThreadLocalTest testThread1 = new ThreadLocalTest();
		ThreadLocalTest testThread2 = new ThreadLocalTest();
		ThreadLocalTest testThread3 = new ThreadLocalTest();
		testThread1.start();
		testThread2.start();
		testThread3.start();
	}
}
