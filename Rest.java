package Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
public class Rest {
	HashMap<String, Integer> menu = null;

	Rest() {
		menu = new HashMap<String, Integer>();
		menu.put("Tea", 20); 
		menu.put("Idly", 40);
		menu.put("Dosa", 70);
		menu.put("Upma", 35);
	}

	void showMenu() {
		Set<String> food = menu.keySet();
		System.out.println("The Food Items Are:");
		for (String f : food) {
			System.out.println(f + " Item Price Is " + menu.get(f));
		}
	}

//	boolean addFoodItem(String fName, int price) {
//		if (menu.containsKey(fName)) {
//			System.out.println("The Item Is Already Present.");
//			return false;
//		} else {
//			menu.put(fName, price);
//			System.out.println("Item Added Successfully");
//			return true;
//		}
//	}
	
	boolean addFoodItem(String fName, int price) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many food items do you want to add? ");
		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.print("Enter food item name: ");
			String name = sc.nextLine();

			System.out.print("Enter price: ");
			int itemPrice = sc.nextInt();
			sc.nextLine(); 

			if (menu.containsKey(name)) {
				System.out.println("The Item \"" + name + "\" Is Already Present.");
			} else {
				menu.put(name, itemPrice);
				System.out.println("Item \"" + name + "\" Added Successfully");
			}
		}
		return true;
	}

	void recommendDish(int budget) {
		System.out.println("Recommended Dishes Under Budget ₹" + budget + ":");
		boolean found = false;

		for (String item : menu.keySet()) {
			int price = menu.get(item);
			if (price <= budget) {
				System.out.println(item + " - ₹" + price);
				found = true;
			}
		}

		if (found==false) {
			System.out.println("Sorry, no items available under ₹" + budget);
		}
	}
}
