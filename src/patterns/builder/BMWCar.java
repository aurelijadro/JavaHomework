package patterns.builder;

public class BMWCar extends CarBuilder {

	@Override
	void buildBrand() {
		System.out.println("BMW");
		
	}

	@Override
	void buildColor() {
		System.out.println(Color.ROSEGOLD);
		
	}

	@Override
	void buildPrice() {
		System.out.println(100000);
		
	}

}
