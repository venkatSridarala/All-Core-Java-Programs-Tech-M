package Collections;

public class RestCustMain {

	public static void main(String[] args) {
		custo c=new custo();
		c.showMenu();
		c.displayOrder();
		boolean b=c.addFoodItem("Poha", 65);
		c.showMenu();
		c.addOrder("Poha", 1);
		c.displayOrder();
		c.bill();
		c.applyCoupon();
	}
}
