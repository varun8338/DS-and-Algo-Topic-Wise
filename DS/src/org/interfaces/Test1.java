package org.interfaces;

public class Test1 extends Thread {
	static Thread mainThread;
	public void run() {
		try {
			mainThread.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println("T " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	public static void main(String[] args) throws InterruptedException {
		mainThread =Thread.currentThread();
		Test1 t = new Test1();
		t.start();
		//t.join();
		try {
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("Main " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
