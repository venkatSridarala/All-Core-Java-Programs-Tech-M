package Oops;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Person Name Is: "+name);
		System.out.println("The Age Is: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Mani",20);
		Person p2=new Person("Hari",22);
		p1.display();
		p2.display();
	}

}
