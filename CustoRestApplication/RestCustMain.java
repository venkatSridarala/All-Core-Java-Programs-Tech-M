package Collections;
import java.util.Scanner;

public class RestCustMain {
	public static void main(String[] args) {
		custo c = new custo();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n===== Restaurant Menu =====");
			System.out.println("1. Show Menu");
			System.out.println("2. Show Order");
			System.out.println("3. Add Food Item");
			System.out.println("4. Add Order");
			System.out.println("5. Display Order");
			System.out.println("6. Generate Bill");
			System.out.println("7. Apply Coupon");
			System.out.println("8. Recommend Dish");
			System.out.println("9. Rate Your Meal");
			System.out.println("10. Exit");
			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
				case 1:
					c.showMenu();
					break;
				case 2:
					c.showOrder();
					break;
				case 3:
					System.out.print("Enter Food Name To Add: ");
					String fname = sc.nextLine();
					System.out.print("Enter Price: ");
					int price = sc.nextInt();
					c.addFoodItem(fname, price);
					break;
				case 4:
					System.out.print("Enter Food Name To Order: ");
					String food = sc.nextLine();
					System.out.print("Enter Quantity: ");
					int qty = sc.nextInt();
					if (!c.addOrder(food, qty)) {
						System.out.println("Item Not Available in Menu.");
					}
					break;
				case 5:
					c.displayOrder();
					break;
				case 6:
					c.bill();
					break;
				case 7:
					c.applyCoupon();
					break;
				case 8:
					System.out.print("Enter Your Budget (₹): ");
					int budget = sc.nextInt();
					c.recommendDish(budget);
					break;
				case 9:
					c.rateMeal();
					break;
				case 10:
					System.out.println("Thank you! Visit Again.");
					break;
				default:
					System.out.println("Invalid Choice! Try Again.");
			}
		} while (choice != 10);
	}
}
