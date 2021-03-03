package com.humachine.java.thread;

public class RunnableObject implements Runnable{
	
	private Thread t;
	
	private String threadName;

	public RunnableObject(String name) {
		System.out.println("Creating  "+threadName);
		this.threadName = name;
		t =new Thread(this, threadName);
	}
	
	public void run() {
		System.out.println("Running "+threadName);
	}
	public void start() {
		System.out.println("Starting "+threadName);
		t.start();
	}
	

}

