package Collections;
import java.util.*;
import java.util.Scanner;
public class custo extends Rest {
	float discount = 0;
	HashMap<String, Integer> order = new HashMap<String, Integer>();
	ArrayList<String> feedbackList = new ArrayList<>();
	void rateMeal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please rate your meal (1 to 5 stars): ");
		int stars = sc.nextInt();
		sc.nextLine(); // clear buffer
		if (stars < 1 || stars > 5) {
			System.out.println("Invalid rating. Please enter between 1 and 5.");
			return;
		}
		System.out.print("Leave a short feedback comment (optional): ");
		String comment = sc.nextLine();
		String feedback = "⭐ " + stars + " Stars - " + (comment.isEmpty() ? "No comment" : comment);
		feedbackList.add(feedback);
		System.out.println("Thank you for your feedback!");
	}

	void showOrder() {
		Set<String> food = order.keySet();
		System.out.println("The Ordered Items Are:");
		for (String f : food) {
			System.out.println(f + " Quantity Is " + order.get(f));
		}
	}

	void displayOrder() {
		Set<String> food = order.keySet();
		System.out.println("The Ordered Items Are:");
		for (String f : food) {
			System.out.println("Item Name: " + f + " ---> Quantity: " + order.get(f) + " * " + super.menu.get(f) + " = " + (order.get(f) * super.menu.get(f)));
		}
	}
	boolean addOrder(String food, int quantity) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many different items do you want to order? ");
		int count = sc.nextInt();
		sc.nextLine(); 

		boolean success = false;

		for (int i = 0; i < count; i++) {
			System.out.print("Enter Food Name To Order: ");
			String name = sc.nextLine();
			System.out.print("Enter Quantity: ");
			int qty = sc.nextInt();
			sc.nextLine(); 
			
			if (menu.containsKey(name)) {
				order.put(name, order.getOrDefault(name, 0) + qty);
				System.out.println("Added " + qty + " of " + name + " to order.");
				success = true;
			} else {
				System.out.println("Item \"" + name + "\" is not available in the menu.");
			}
		}

		return success;
	}


	void bill() {
		int total = 0;
		Set<String> food = order.keySet();
		for (String f : food) {
			total += order.get(f) * super.menu.get(f);
		}
		System.out.println("The Total Bill Is: " + total);
		System.out.println("Bill > ₹200? You Get 10% Discount!");
		if (total > 200) {
			discount = total - (total * 10 / 100);
			System.out.println("After Discount: ₹" + discount);
		} else {
			discount = total;
			System.out.println("No Discount Applied");
		}
	}

	void applyCoupon() {
		String coupon = "SaveAmt";
		System.out.println("Enter Coupon Name To Get Discount:");
		Scanner sc = new Scanner(System.in);
		String AppCou = sc.nextLine();
		if (AppCou.equals(coupon)) {
			float dis = discount - (discount * 5 / 100);
			System.out.println("After Coupon Applied, Payable Amount: ₹" + dis);
		} else {
			System.out.println("Invalid Coupon!");
		}
	}
}
