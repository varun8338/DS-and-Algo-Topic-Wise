package com.multithreading;

public class Consumer extends Thread {
	Company c;
	
	public Consumer(Company c) {
		this.c=c;
	}
	
	@Override
	public void run() {
		while(true) {
			this.c.consume_item();
			try {Thread.sleep(2000);}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}
