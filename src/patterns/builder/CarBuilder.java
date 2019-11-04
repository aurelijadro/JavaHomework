package patterns.builder;

public abstract class CarBuilder {
	
	Car car;
	
	abstract void buildBrand();
	abstract void buildColor();
	abstract void buildPrice();
	
	void createCar() {
		this.car = new Car();
	}
	
	Car getCar() {
		return this.car;
	}
	@Override
	public String toString() {
		return "CarBuilder [car=" + car + "]";
	}
	
	
	

}
