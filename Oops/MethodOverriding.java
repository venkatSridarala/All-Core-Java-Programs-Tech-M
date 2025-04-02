package Oops;

class A1{
	void display()
	{
		System.out.println("This is A1 Class.");
	}
}
class A2 extends A1{
	void display() {
		System.out.println("This Is A2 Class.");
	}
}
class A3 extends A1{
	void display() {
		super.display();
		System.out.println("This Is A3 Class.");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A2();
		a.display();
		A1 b=new A3();
		b.display();
	}

}
