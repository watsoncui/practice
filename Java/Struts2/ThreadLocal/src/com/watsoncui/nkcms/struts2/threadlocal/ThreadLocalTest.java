package com.watsoncui.nkcms.struts2.threadlocal;

public class ThreadLocalTest extends Thread {
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Thread[" + Thread.currentThread().getName() + "], counter = " + Counter.getNextCounter());
		}
	}
}