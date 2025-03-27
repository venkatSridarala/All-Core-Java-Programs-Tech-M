package Arrays;

public class Saloon {
	Customer c;
	String Progress;
	int price;
	public Saloon(Customer c, String progress,int price) {
		this.c = c;
		this.Progress = progress;
		this.price=price;
	}
	void display() {
		System.out.println("CustomerId:"+c.id);
		System.out.println("Customer Name:"+c.CustoName);
		System.out.println("Why Should He Came:"+c.WhyShouldHeCame);
		System.out.println("Progress:"+Progress);
		System.out.println("Total Price:"+price);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Customer c = new Customer(201,"Mahesh","Hair Cut");
		Saloon s=new Saloon(c,"Completed",500);
		s.display();
		Customer c1 = new Customer(202,"Shiva","Face Massage");
		Saloon s1=new Saloon(c1,"Completed",700);
		s1.display();
		Customer c2 = new Customer(203,"Manikanta","For Entertiment");
		Saloon s2=new Saloon(c2,"Until Previous Customer Cutting Completed",0);
		s2.display();
		Customer c3 = new Customer(204,"Gagan","Head Massage");
		Saloon s3=new Saloon(c3,"OnGoing",1000);
		s3.display();
		Customer c4 = new Customer(205,"Teja","Beard Cut");
		Saloon s4=new Saloon(c4,"Completed",400);
		s4.display();
		Saloon sn[]=new Saloon[6];
		sn[0]=s;
		sn[1]=s1;
		sn[2]=s2;
		sn[3]=s3;
		sn[4]=s4;
		int count=0;
		for(Saloon k:sn) {
			if(k != null) {
				count++;
			}
		}
		System.out.println("Number of customers per Day:"+count);
	}

}
