package Oops;
public class Employee3 {
	String Name;
	double Salary;
	int hireYear;
	public Employee3(String name, double salary, int hireYear) {
		Name = name;
		Salary = salary;
		this.hireYear = hireYear;
	}
	void display() {
		System.out.println("The Employee Name is: "+Name);
		System.out.println("The Salary Is: "+Salary);
		System.out.println("The Hired Year Is: "+hireYear);
	}
	int presentYear;
	void YofService(int presentYear) {
		int s=presentYear-hireYear;
		if(s>4) {
			System.out.println(Name+" is Permanent Employee "+"Beacuse Above "+s+"Years Worked.");
		}
		else {
			System.out.println(Name+" is Temporary Employee "+"Beacuse Below"+s+"Years Worked.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e=new Employee3("Shiva",50000,2025);
		e.display();
		e.YofService(2030);
	}
}
