package Oops;

public class MethodOverloading {

	public int add(int a,int b) {
		return a+b;
	}

	public double add(double a,double b) {
		return a-b;
	}
	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		m.add(10,40);
		m.add(20.0, 46.0);
	}

}
