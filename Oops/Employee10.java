package Oops;
class employ
{
	String name;
	int salary;
	public employ(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	void work()
	{
		System.out.println("Fill the excel sheet .");
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	void getsalary()
	{
		System.out.println(" Name : "+name);
		System.out.println(" Salary : "+salary);
	}
}
class HRmanager extends employ
{

	public HRmanager(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	void work()
	{
		System.out.println("Test the code .");
	}
	
	void addemploye()
	{
		System.out.println("A new emplyee is being added .");
	}		
}
public class Employee10 extends HRmanager {

	public Employee10(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRmanager e=new HRmanager("hari", 50000);
		e.work();
		e.getsalary();
		e.addemploye();
	}

}