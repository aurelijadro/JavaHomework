package patterns.builder;

public class Buyer {

	public static void main(String[] args) {
		Director director =new Director();
		director.setCarBuilder(new PorsheCar());
		Car car = director.buildCar();
		director.setCarBuilder(new BMWCar());
		Car car2 = director.buildCar();

	}

}
