package org.interfaces;

public class Test extends Thread {
	
	public void run() {
		int count=0;
		for(int i=55;i<=120;i++) {
			try {
				Thread.sleep(1000);
				if(i%60==0) {
					count++;
				}
				System.out.println(count+":"+i%60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(10);
		Test t=new Test();
		t.start();
	}
	

	

}
