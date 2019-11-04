package patterns.factory;

public class PorcheCarFactory implements CarFactory {

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		return new PorcheCar();
	}

}
