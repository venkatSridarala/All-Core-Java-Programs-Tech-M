package Oops;

public class TrafficLight {
	String Color;
	double Duration;
	public TrafficLight(String color, double duration) {
		Color = color;
		Duration = duration;
	}
	void show() {
		System.out.println("The Current Color is :"+Color+" Duration is "+Duration);
	}
	void changeColor(String newColor) {
		Color=newColor;
		System.out.println("The Changed Color Is :"+Color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight light=new TrafficLight("Green",30);
		light.show();
		light.changeColor("Red");
		
	}
// }
// output
// The Current Color is :Green Duration is 30.0
// The Changed Color Is :Red
