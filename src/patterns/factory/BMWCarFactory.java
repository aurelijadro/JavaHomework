package patterns.factory;

public class BMWCarFactory implements CarFactory{

	@Override
	public Car makeCar() {
		
		return new BMWCar();
	}

}
