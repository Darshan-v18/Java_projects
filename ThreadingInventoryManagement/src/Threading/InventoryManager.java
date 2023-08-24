package Threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	List<Product> soldProductsList=new CopyOnWriteArrayList<Product>();
	List<Product> purchaseProductList=new CopyOnWriteArrayList<Product>();
	
	public void populateSoldProduct() {
		for(int i=0;i<1000;i++) {
			Product prod=new Product(i,"test_product_"+i);
			soldProductsList.add(prod);
			System.out.println( "Added "+ prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
	public void displaySoldProducts() {
		for(Product product:soldProductsList) {
			System.out.println("Printing the Sold: "+product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}