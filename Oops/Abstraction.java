package Oops;
abstract class shape
{
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
class circle extends shape
{
	public void calculateArea() {
		// TODO Auto-generated method stub
		int r=5;
		double area=2.17*r*r;
		System.out.println("The area of circle : "+area);
	}
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		int r=5;
		double area=2*2.17*r;
		System.out.println("The perimeter of circle : "+area);
	}
}
class Triangle extends shape
{
	public void calculateArea() {
		// TODO Auto-generated method stub
		int h=5;
		int b=10;
		double mul=0.5*h*b;
		System.out.println("The area of triangle : "+mul);
	}
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		int a=5;
		int b=5;
		int c=5;
		double add=a+b+c;
		System.out.println("The perimeter of circle : "+add);
	}
}
public class Abstraction  {
	public static void main(String[]args)
	{
		circle c=new circle();
		c.calculateArea();
		c.calculatePerimeter();
		Triangle t=new Triangle();
		t.calculateArea();
		t.calculatePerimeter();
	}	
// }
// output
// The area of circle : 54.25
// The perimeter of circle : 21.7
// The area of triangle : 25.0
// The perimeter of circle : 15.0
