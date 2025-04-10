package Collections;

import java.util.ArrayList;
import java.util.List;
public class Inventory {
	List<ProductClass>products;

	public Inventory() {
		this.products = new ArrayList<>();
	}
	public void addProduct(ProductClass product) {
		this.products.add(product);
	}
	public void removeProduct(String name1) {
		boolean productFound=false;
		for(ProductClass product:products) {
			if(ProductClass.name1.equals(name1)) {
				System.out.println("Product");
				products.remove(product);
				productFound=true;
				break;
			}
		}
		if(!productFound) {
			System.out.println("There is not product found with name"+name1);
		}
	}
	public void showProducts() {
		for(ProductClass product:products) {
			System.out.println(product.toString());
		}
	}
	public void checkLowInventory() {
		if(products.size()<3) {
			System.out.println("Low Inventory detected with size of : "+products.size());
		}else {
		System.out.println("Inventory is with capacity of "+products.size());
		}
		
	}
}
