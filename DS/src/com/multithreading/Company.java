package com.multithreading;

public class Company {
	private int n;
	boolean isConsumer=false;
	//if isConsumer false then producer is running
	public synchronized void produce_item(int n) {
		if(isConsumer) {
			try {wait();} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.n=n;
		System.out.println("Item Produced is: "+this.n);
		isConsumer=true;
		notify();
	}
	
	public synchronized int consume_item() {
		if(!isConsumer) {
			try {wait();}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Item consumed is: "+this.n);
		isConsumer=false;
		notify();
		return this.n;
	}
}
