package new_calculator;


public class Calculator {

	public static double roundNumber(double num) {
		double roundedNum = num * 10000;
		roundedNum = Math.round(roundedNum);
		roundedNum = roundedNum / 10000;
		return roundedNum;
	}

	public static double add(double a, double b) {
		return roundNumber(a + b);
	}

	public static double substract(double a, double b) {
		return roundNumber(a-b);
	}
	public static double miltiply(double a, double b) {
		return roundNumber(a*b);
	}

	public static double divide(double a, double b) {
		if (a==0 || b==0) {
			return 0;
		}
		return roundNumber(a/b);
	}
	
	public static double calculateRemainder(double a, double b) {
		return roundNumber(a%b);
	}
	
	public static double calculateSquareRoot(double a) {
		return roundNumber(Math.sqrt(a));
	}
	
	public static double squareNumber(double a) {
		return roundNumber(Math.pow(a, 2));
	}
	
	public static double calculateExponent(double a, double b) {
		return roundNumber(Math.pow(a, b));
	} 
	
	public static double calculateSin(double a) {
		return roundNumber(Math.sin(a));
	}
	
	public static double calculateCos(double a) {
		return roundNumber(Math.cos(a));
	}
	
	public static double calculateTan(double a) {
		return roundNumber(Math.tan(a));
	}
	
	public static double calculateCtg(double a) {
		return roundNumber(1/Math.tan(a));
	}
	
	public static double calculatePercent (double a, double b) {
		// method calculates how much percent is b to a.
		return roundNumber(b*100/a);
	}

}