package hw12_objective_programming1;

public class Item {
	private String title;
	private double priceInEur; 
	private int VAT;
	
	public Item(String title, double priceInEur) {
		this(title, priceInEur, 21);
		
	}
	public Item(String title, double priceInEur, int VAT) {
		this.title = title;
		this.priceInEur = priceInEur;
		this.VAT = VAT;
	}
	
	public int getVAT() {
		return VAT;
	}
	
	@Override
	public String toString() {
		return "Item ["+ title + ", priceInEur=" + priceInEur + ", VAT=" + VAT + "]";
	}
	public double calculatePriceAfterVAT() {
		return this.priceInEur+((this.priceInEur*this.VAT)/100);
	}
	
	public double calculatePriceInUSDBeforeVAT(){
		return this.priceInEur*1.10;
	}
	
	public double calculatePriceInUSDAfterVAT(){
		return calculatePriceInUSDBeforeVAT()+calculatePriceInUSDBeforeVAT()*this.VAT;
	}

	public String getTitle() {
		return title;
	}

	public double getPriceInEur() {
		return priceInEur;
	}
	
	
	
	
	
}
