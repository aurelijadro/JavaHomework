package hw12_objective_programming1;

import java.util.Arrays;

public class ShoppingCart {
	Item[] items = new Item[0];

	public ShoppingCart() {

	}

	public double priceBeforeVAT() {
		double total = 0;
		for (Item item : items) {
			total += item.getPriceInEur();
		}
		return total;
	}

	public double priceAfterVAT() {
		double total = 0;
		for (Item item : items) {
			total += item.calculatePriceAfterVAT();
		}
		return total;
	}

	public void addItemToCart(Item item) {

		Item[] updatedCart = new Item[items.length + 1];
		for (int i = 0; i < items.length; i++) {
			updatedCart[i] = items[i];
		}
		updatedCart[items.length] = item;
		this.items = updatedCart;
	}

	public void whatsInside() {
		if (items.length == 0) {
			System.out.println("Your shopping cart is empty!");
		} else {

			System.out.println("Good choices! In your shooping cart:");
			for (Item item : this.items) {
				System.out.println(item.toString());
			}

		}
	}

}
