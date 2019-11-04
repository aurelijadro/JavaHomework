package patterns.factory;



public class Buyer {

	public static void main(String[] args) {
		
		CarFactory carFactory = createCarByBrand("BMW");
		Car car = carFactory.makeCar();
		car.testDrive();
		
		CarFactory carFactory2 = createCarByBrand("Porshe");
		Car car2 = carFactory2.makeCar();
		car2.testDrive();
		
	}
		
		private static CarFactory createCarByBrand(String brand) {
			if (brand.equals("BMW")) {
				return new BMWCarFactory();
			}
			if (brand.equals("Porshe")) {
				return new PorcheCarFactory();
			}
			throw new RuntimeException("Brand not supported...");
		}
	}


