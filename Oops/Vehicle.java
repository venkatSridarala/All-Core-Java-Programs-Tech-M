package Oops;

class Car {
	void drive() {
		System.out.println("Driving a Car");
	}
}
class Vehicle extends Car{
	void drive() {
		System.out.println("Reparing a car");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car v = new Car();
		v.drive();
	}
}
