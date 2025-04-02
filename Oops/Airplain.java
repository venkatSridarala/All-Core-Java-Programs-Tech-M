//1)Write a Java program to create a class called "Airplane" with a flight number, destination,
//and departure time attributes, and methods to check flight status and delay
package Oops;

public class Airplain {
	String flightNumber,destination;
	double departureTime;
	
	public Airplain(String flightNumber, String destination, double departureTime) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.departureTime = departureTime;
	}
	void checkStatus() {
		System.out.println("Flight No: "+flightNumber+" to "+destination+" departs at "+departureTime);
	}
	void delay(double extraMin) {
		departureTime =departureTime+extraMin;
		System.out.println("The delay Is: "+departureTime);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplain a=new Airplain("A11002E","Mumbai",12.15);
		a.checkStatus();
		a.delay(1.00);
	}
}
//output
//Flight No: A11002E to Mumbai departs at 12.15
//The delay Is: 13.15
