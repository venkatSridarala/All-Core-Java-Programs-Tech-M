package Collections;

public class InventoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory=new Inventory();
		inventory.addProduct(new ProductClass("Iphone"));
		inventory.addProduct(new ProductClass("Nothing phone(2a)"));
		inventory.addProduct(new ProductClass("Google Pixel"));
		inventory.checkLowInventory();
		inventory.removeProduct("Iphone");
		inventory.checkLowInventory();
	}
}
