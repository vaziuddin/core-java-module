package com.humachine.java.thread;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("Printing plus "+i+" in a worker thread.");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
		for (int j = 0; j < 20; j++) {
			System.out.println("Printing plus "+j+" in a main thread.");
			try {
				Thread.sleep(900);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
