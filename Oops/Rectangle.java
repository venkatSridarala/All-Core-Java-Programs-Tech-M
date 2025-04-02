package Oops;

public class Rectangle {
	double width;
	double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	void area() {
		System.out.println("The area of the rectangle is: "+width*height);
	}
	void perimeter() {
		System.out.println("The Perimeter of the Rectangle is: "+2*(width+height));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(10,5);
		r.area();
		r.perimeter();
	}

}
