package com.resource;

public class BookTheatreSeat {
	int totalSeats=10;
	
	public void bookSeat(int seat) {
		if(totalSeats>=seat) {
			System.out.println("Booking success");
			totalSeats=totalSeats-seat;
			System.out.println("Seats left: "+totalSeats);
		}
		else {
			System.out.println("Booking failed");
			System.out.println("Seats left: "+totalSeats);
		}
	}
}
