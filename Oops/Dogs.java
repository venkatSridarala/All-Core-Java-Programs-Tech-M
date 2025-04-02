package Oops;
public class Dogs {
	String name;
	String breed;
	public Dogs(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	void setName(String name) {
		this.name=name;
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("The dog Name Is: "+name);
		System.out.println("The dog breed is: "+breed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d1=new Dogs("Rocky","German Shepard");
		Dogs d2 = new Dogs("Anji","Golden Retriver");
		d1.setName("Max");
		d1.setBreed("Laboured");
		d2.setName("Maxy");
		d2.setBreed("pitbull");
		d1.display();
		d2.display();
	}
// }
// output
// The dog Name Is: Max
// The dog breed is: Laboured
// The dog Name Is: Maxy
// The dog breed is: pitbull
