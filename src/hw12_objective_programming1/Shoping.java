package hw12_objective_programming1;

public class Shoping {

	public static void main(String[] args) {
		Item computer = new Item ("Computer", 1000.00);
		Medicine coldrex = new Medicine("Coldrex", 20.00);
		Press magazine = new Press ("Magazine", 10.00);
				
		ShoppingCart myCart = new ShoppingCart();
		myCart.addItemToCart(magazine);
		myCart.addItemToCart(coldrex);
		myCart.addItemToCart(computer);
		myCart.whatsInside();
		System.out.println("Price before VAT: " + myCart.priceBeforeVAT());
		System.out.println("Price after VAT: " + myCart.priceAfterVAT());
		

	}

}
