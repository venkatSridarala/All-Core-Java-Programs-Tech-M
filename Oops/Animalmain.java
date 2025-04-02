package Oops;

class Animal
{
	void eat()
	{
	System.out.println("The animals are eating.");
	}
}
class Dog extends Animal
{
	void bark()
{
System.out.println("The dog is barking");
}
	}
class puppy extends Dog{
	void sleep() {
		System.out.println("The puppy is sleeping.");
	}
}
public class Animalmain {

	public static void main(String[] args) {
		Dog dg =new Dog();
		dg.bark();
		dg.eat();
		puppy py = new puppy();
		py.sleep();
	}

}
