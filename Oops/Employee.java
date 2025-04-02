package Oops;
public class Employee {
	String name,jobTitle;
	double salary;
	
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	void updateSalary(double increment) {
		salary=salary+increment;
		System.out.println("The Updated Salary is: "+salary);
	}
	void display() {
		System.out.println("Employee Name is:"+name);
		System.out.println("The Job Title is:"+jobTitle);
		System.out.println("The Salary is :"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Giridhar","Java Developer",60000);
		e.display();
		e.updateSalary(5000);
	}
}
