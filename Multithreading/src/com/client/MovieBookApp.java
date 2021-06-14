package com.client;

import com.resource.BookTheatreSeat;

public class MovieBookApp extends Thread {
	static BookTheatreSeat b;
	int seats;
	@Override
	public void run() {
		b.bookSeat(seats);
	}
	
	
	public static void main(String[] args) {
		b=new BookTheatreSeat();
		
		MovieBookApp varun=new MovieBookApp();
		varun.seats=7;
		varun.start();
		
		MovieBookApp tarun=new MovieBookApp();
		tarun.seats=6;
		tarun.start();
	}
}
