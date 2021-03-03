package com.humachine.java.thread;

public class ThreadClass extends Thread {
	
	public void run() {
		super.run();
		System.out.println("My name is Vaziuddin Mohammed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadClass thread = new ThreadClass();
		thread.start();

	}

}
