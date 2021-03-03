package com.humachine.java.thread;

public class TestIsThread{
	public static void main(String[] args) {
		RunnableObject r1 = new RunnableObject("Thread-1");
		r1.start();
	}
}