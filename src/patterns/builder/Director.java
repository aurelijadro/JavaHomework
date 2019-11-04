package patterns.builder;

public class Director {
	CarBuilder carBuilder;
	
	public void setCarBuilder(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
		
	}
	
	Car buildCar() {
		carBuilder.buildBrand();
		carBuilder.buildColor();
		carBuilder.buildPrice();
		Car car = carBuilder.getCar();
		return car;
	}
	
	
}
