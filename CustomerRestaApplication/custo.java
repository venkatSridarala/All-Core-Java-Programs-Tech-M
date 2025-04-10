package Collections;
import java.util.*;
import java.util.HashMap;
import java.util.Set;

public class custo extends Rest {
	float discount=0;
	HashMap<String, Integer>order=null;
	custo(){
		order=new HashMap<String,Integer>();
		order.put("Dosa", 1);
		order.put("Idly", 2);
	}
	void showOrder() {
		super.showMenu();
	}
	void displayOrder() {
		Set <String> food=order.keySet();
		System.out.println("The Ordered Items Are:");
		for(String f:food) {
			System.out.println("Item Name Is: "+f+"---->quantity is "+order.get(f)+"*"+super.menu.get(f)+"="+order.get(f)*super.menu.get(f));
		}
	}
	boolean addOrder(String food,int quantity) {
		if(menu.containsKey(food)) {
			order.put(food, quantity);
			System.out.println("Order added Successful");
			return true;
		}
		else {
			return false;
		}
	}
	void bill() {
		int total=0;
		Set<String> food=order.keySet();
		for(String f:food) {
			total=total+order.get(f)*super.menu.get(f);
		}
		System.out.println("The Total Bill Is: "+total);
		System.out.println("Bill Is Greater Than 200 You Will Get Discount 10%");
		if(total>200) {
			discount=total-(total*10/100);
			System.out.println("After Discount "+discount);
		}
		else {
			System.out.println("You will Didn't get any discount");
		}
		}
	void applyCoupon() {
		String coupon="SaveAmt";
		System.out.println("Enter Coupon Name To Get Discount:");
		Scanner sc=new Scanner(System.in);
		String AppCou=sc.nextLine();
		if(AppCou.equals(coupon)) {
			float dis=discount-(discount*5/100);
			System.out.println("After Coupon Applied You Payable Amount Is: "+dis);
		}
	}
}