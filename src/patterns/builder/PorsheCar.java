package patterns.builder;

public class PorsheCar extends CarBuilder {

	@Override
	void buildBrand() {
		System.out.println("Porshe");
		
	}

	@Override
	void buildColor() {
		System.out.println(Color.YELLOW);
		
	}

	@Override
	void buildPrice() {
		System.out.println(540000);
		
	}

	@Override
	public String toString() {
		return "PorsheCar [car=" + car + "]";
	}
	
	

}
