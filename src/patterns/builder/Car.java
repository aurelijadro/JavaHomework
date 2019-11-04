package patterns.builder;

public class Car {
	private String brand;
	private Color color;
	private int price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return brand + " car in a beautiful " + color + " color: " + price + "Eur.";
	}
	
	
		
		
}
